package com.company.category.dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

public class Icecream {
    private static int[][] board = {
            {0, 0, 1, 1, 0},
            {0, 0, 0, 1, 1},
            {1, 1, 1, 1, 1},
            {0, 0, 0, 0, 0},
    };

    public static void main(String[] args) {

        int answer = 0;

        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[i].length; j++) {
                if (dfs(i, j)) {
                    answer++;
                }
            }
        }

        System.out.println("answer = " + answer);
    }

    public static boolean dfs(int x, int y) {
        if (x < 0 || x >= board.length || y < 0 || y >= board[x].length) {
            return false;
        }

        if (board[x][y] == 0) {
            board[x][y] = 1;

            // 상하좌우 위치들 모두 재귀적 호출
            dfs(x-1, y);
            dfs(x, y-1);
            dfs(x+1, y);
            dfs(x, y+1);
            return true;
        }
        return false;
    }

}
