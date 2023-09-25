package com.company.lv2.day_230925;

// https://school.programmers.co.kr/learn/courses/30/lessons/87946
public class Q2_n2배열자르기_wrong2 {

//    private static int n = 3;
//    private static long left = 2;
//    private static long right = 5;

    private static int n = 3;
    private static long left = 3;
    private static long right = 4;

    static int[][] arr;

    public static void main(String[] args) {
        arr = new int[n][n];
        int[] answer = new int[(int)(right - left + 1)];

        for (int i=n; i>0; i--) {
            fill(i);
        }

        StringBuilder sb = new StringBuilder();
        long idx = 0;
        for (int[] i : arr) {
            for (int j : i) {
                idx++;
                if (idx > left && idx <= right+1) {
                    sb.append(j);
                }
            }
        }

        for (int i=0; i<sb.toString().length(); i++) {
            answer[i] = sb.charAt(i) - '0';
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }

    public static void fill(int end) {
        for (int i=0; i<end; i++) {
            for (int j=0; j<end; j++) {
                arr[i][j] = end;
            }
        }
    }
}
