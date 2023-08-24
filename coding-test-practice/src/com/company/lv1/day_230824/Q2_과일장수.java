package com.company.lv1.day_230824;

import java.util.Arrays;

public class Q2_과일장수 {

//    private static int k = 3;
//    private static int m = 4;
//    private static int[] score = {1, 2, 3, 1, 2, 3, 1};

    private static int k = 4;
    private static int m = 3;
    private static int[] score = {4,1,2,2,4,4,4,4,1,2,4,2};

    public static void main(String[] args) {
        int answer = 0;

        Arrays.sort(score);
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int i=score.length-1; i>=0; i--) {
            int temp = score[i];

            if (min > temp) {
                min = temp;
            }

            count+=1;

            if (count == m) {
                answer += m*min;
                count = 0;
            }
        }

        System.out.println("answer = " + answer);
    }
}
