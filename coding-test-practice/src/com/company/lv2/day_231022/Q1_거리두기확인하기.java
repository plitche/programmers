package com.company.lv2.day_231022;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/81302
public class Q1_거리두기확인하기 {

    private static String[][] places = {
            {"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
            {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
            {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
            {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
            {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}
    };

    public static void main(String[] args) {
        int[] answer = new int[5];

        for (int i = 0; i < 5; i++) {
            char[][] arr = new char[5][5];
            for (int j = 0; j < 5; j++) arr[j] = places[i][j].toCharArray();

            boolean isStop = false;
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    if (arr[j][k] == 'P') {
                        boolean check = check(arr, j, k);
                        if (!check) {
                            isStop = true;
                            break;
                        }
                    }
                }
                if (isStop) break;
            }
            if (!isStop) answer[i] = 1;
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }

    public static boolean check(char[][] arr, int y, int x) {
        boolean result = true;
        // 무조건 안됌 인접
        int[] yArr = {-1, 1, 0, 0};
        int[] xArr = {0, 0, -1, 1};
        for (int i = 0; i < 4; i++) {
            if ((y < 1 && i == 0) || (y == 4 && i == 1) || (x < 1 && i == 2) || (x == 4 && i == 3)) continue;
            if (arr[y + yArr[i]][x + xArr[i]] == 'P') return false;
        }


        // 중간에 가로막혀 있으면 ok
        int[] yArr1 = {-2, 2, 0, 0};
        int[] xArr1 = {0, 0, -2, 2};
        for (int i = 0; i < 4; i++) {
            if ((y < 2 && i == 0) || (y > 2 && i == 1) || (x < 2 && i == 2) || (x > 2 && i == 3)) continue;
            if (arr[y + yArr1[i]][x + xArr1[i]] == 'P' && arr[y + yArr1[i]/2][x + xArr1[i]/2] != 'X') return false;
        }


        // 대각선
        int[] yArr2 = {-1, 1, -1, 1};
        int[] xArr2 = {-1, -1, 1, 1};
        for (int i = 0; i < 4; i++) {
            if (((y < 1 || x < 1) && i == 0) ||
                ((y == 4 || x < 1) && i == 1) ||
                ((y < 1 || x == 4) && i == 2) ||
                ((y == 4 || x == 4) && i == 3)) continue;

            if (arr[y + yArr2[i]][x + xArr2[i]] == 'P') {
                if (arr[y + yArr2[i]][x] != 'X' || arr[y][x + xArr2[i]] != 'X')
                return false;
            }
        }

        return result;
    }

}
