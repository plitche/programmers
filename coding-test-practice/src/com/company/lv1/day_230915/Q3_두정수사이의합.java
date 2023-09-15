package com.company.lv1.day_230915;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/12912
public class Q3_두정수사이의합 {

    private static int a = 3;
    private static int b = 5;

    public static void main(String[] args) {
        long answer = 0;

        int max = Math.max(a, b);
        int min = Math.min(a, b);

        for (int i=min; i<=max; i++) {
            answer += i;
        }

        System.out.println("answer = " + answer);
    }

}
