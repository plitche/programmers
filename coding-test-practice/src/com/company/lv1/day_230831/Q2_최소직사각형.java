package com.company.lv1.day_230831;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/86491
public class Q2_최소직사각형 {

    private static int[][] sizes = {
            {60, 50},
            {30, 70},
            {60, 30},
            {80, 40}
    };

    public static void main(String[] args) {
        int answer = 0;

        int length = sizes.length;
        int[] a = new int[length];
        int[] b = new int[length];
        for (int i=0; i<length; i++) {
            int x = sizes[i][0];
            int y = sizes[i][1];

            if (y > x) {
                a[i] = y;
                b[i] = x;
            } else {
                a[i] = x;
                b[i] = y;
            }
        }

        Arrays.sort(a);
        Arrays.sort(b);
        answer = a[length-1] * b[length-1];

        System.out.println("answer = " + answer);
    }
}
