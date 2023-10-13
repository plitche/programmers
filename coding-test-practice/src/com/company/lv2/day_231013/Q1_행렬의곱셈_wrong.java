package com.company.lv2.day_231013;

// https://school.programmers.co.kr/learn/courses/30/lessons/12949
public class Q1_행렬의곱셈_wrong {

    private static int[][] arr1 = {
            {1, 4},
            {3, 2},
            {4, 1}
    };
    private static int[][] arr2 = {
            {3, 3},
            {3, 3}
    };

    public static void main(String[] args) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i=0; i<answer.length; i++) {
            for (int j=0; j<answer[0].length; j++) {
                answer[i][j] = arr1[i][j] * arr2[j][i];
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
