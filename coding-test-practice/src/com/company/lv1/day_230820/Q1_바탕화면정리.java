package com.company.lv1.day_230820;

// https://school.programmers.co.kr/learn/courses/30/lessons/161990
public class Q1_바탕화면정리 {

    //private static String[] wallpaper = {".#...", "..#..", "...#."};
    private static String[] wallpaper = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
    //private static String[] wallpaper = {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};
    //private static String[] wallpaper = {"..", "#."};

    public static void main(String[] args) {

        // 2차원 배열로 변형
        char[][] arr = new char[wallpaper.length][wallpaper[0].length()];
        for (int i=0; i<wallpaper.length; i++) {
            String s = wallpaper[i];

            for (int j=0; j<s.length(); j++) {
                arr[i] = s.toCharArray();
            }
        }

        int minX = arr[0].length; // 가로
        int maxX = 0;
        int minY = arr.length; // 세로
        int maxY = 0;

        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[0].length; j++) {
                if (arr[i][j] == '#') {
                    if (i < minY) {
                        minY = i;
                    }
                    if (i+1 > maxY) {
                        maxY = i+1;
                    }

                    if (j < minX) {
                        minX = j;
                    }
                    if (j+1 > maxX) {
                        maxX = j+1;
                    }
                }
            }
        }

        int[] answer = new int[]{minY, minX, maxY, maxX};

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}
