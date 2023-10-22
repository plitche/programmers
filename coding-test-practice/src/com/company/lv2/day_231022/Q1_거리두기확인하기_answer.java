package com.company.lv2.day_231022;

import java.util.LinkedList;
import java.util.Queue;

// https://school.programmers.co.kr/learn/courses/30/lessons/81302
public class Q1_거리두기확인하기_answer {

    private static String[][] places = {
            {"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
            {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
            {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
            {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
            {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}
    };

    static int[] dx = new int[]{-1,0,1,0};
    static int[] dy = new int[]{0,1,0,-1};

    static class node{
        int x;
        int y;
        int dist;
        public node(int a,int b, int c){
            this.x = a;
            this.y = b;
            this.dist = c;
        }
    }

    public static void main(String[] args) {
        int[] answer = new int[places.length];

        for (int x = 0; x < places.length; x++) {
            String[] place = places[x];
            char[][] map = new char[5][5];

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    map[i][j] = place[i].charAt(j);
                }
            }

            answer[x] = bfs(map);
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }

    public static int bfs(char[][] map){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(map[i][j] != 'P') continue;
                boolean[][] check = new boolean[5][5];
                Queue<node> q = new LinkedList<>();
                q.add(new node(i,j,0));
                check[i][j] = true;

                while(!q.isEmpty()){
                    node cur = q.poll();

                    for (int dir = 0; dir < 4; dir++) {
                        int nx = cur.x + dx[dir];
                        int ny = cur.y + dy[dir];
                        int ndist = cur.dist + 1;

                        if(ndist > 2) continue;
                        if(nx < 0 || nx > 4 || ny < 0 || ny > 4) continue;
                        if(check[nx][ny]) continue;

                        if(map[nx][ny] == 'P') return 0;
                        if(map[nx][ny] == 'O'){
                            check[nx][ny] = true;
                            q.add(new node(nx,ny,ndist));
                        }
                    }
                }
            }
        }
        return 1;
    }

}
