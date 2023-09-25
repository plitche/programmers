package com.company.lv2.day_230925;

// https://school.programmers.co.kr/learn/courses/30/lessons/87946
public class Q2_n2배열자르기_wrong {

    private static int n = 3;
    private static long left = 2;
    private static long right = 5;

    static int[][] arr = new int[n][n];

    public static void main(String[] args) {
        int[] answer = new int[(int)(right - left + 1)];

        for (int i=n; i>0; i--) {
            fill(i);
        }

        StringBuilder sb = new StringBuilder();
        for (int[] i : arr) {
            for (int j : i) {
                sb.append(j);
            }
        }

//        String result = sb.substring(left, right+1);
//        int idx = 0;
//        for (long i=left; i<=right; i++) {
//            answer[idx] = sb.charAt(i) - '0';
//            idx++;
//        }

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
