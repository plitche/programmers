package com.company.lv2.day_231017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

// https://school.programmers.co.kr/learn/courses/30/lessons/154538
public class Q2_무인도여행 {

    private static String[] maps = {"X591X","X1X5X","X231X", "1XXX1"};

//    "X591X"
//    "X1X5X"
//    "X231X"
//    "1XXX1"

    static char[][] arr;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        int x = maps[0].length();
        int y = maps.length;

        visited = new boolean[y][x];
        arr = new char[y][x];

        for (int i=0; i< maps.length; i++) {
            arr[i] = maps[i].toCharArray();
        }

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (arr[i][j] != 'X' && !visited[i][j]) {
                    list.add(bfs(i, j));
                }
            }
        }

        if (list.size() == 0) {
            list.add(-1);
        }
        Collections.sort(list);
        System.out.println("list = " + list);
    }

    public static int bfs(int x, int y) {
        int sum = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;

        while(!queue.isEmpty()) {
            int[] line = queue.poll();
            int cx = line[0];
            int cy = line[1];

            sum += arr[cx][cy]-'0';
            for (int i = 0; i < 4; i++) {
                int nx = cx+dx[i];
                int ny = cy+dy[i];
                if (nx < 0 || ny < 0 || nx >= arr.length || ny >= arr[0].length) {
                    continue;
                }
                if (!visited[nx][ny] && arr[nx][ny] != 'X') {
                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx, ny});
                }
            }

        }

        return sum;
    }
}
