package com.company.lv1.day_230911;

// https://school.programmers.co.kr/learn/courses/30/lessons/12934
public class Q1_정수제곱근판별 {

    private static long n = 121;

    public static void main(String[] args) {
        double x = Math.sqrt((double)n);

        if (n % x == 0) {
            System.out.println(Math.pow((long)x+1, 2));
        } else {
            System.out.println(-1);
        }
    }

}
