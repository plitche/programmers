package com.company.lv1.day_230910;

// https://school.programmers.co.kr/learn/courses/30/lessons/12950
public class Q1_행렬의덧셈 {

    private static int[][] arr1 = {
            {1, 2},
            {2, 3}
    };

    private static int[][] arr2 = {
            {3, 4},
            {5, 6}
    };

    public static void main(String[] args) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i=0; i<arr1.length; i++) {
            for (int j=0; j<arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }


        for (int[] ints : answer) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

}
