package com.company.lv2.day_231010;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/12953
public class Q3_피보나치수 {

    //    private static int n = 3;
    private static int n = 100000;
    private static long[] memo = new long[n + 1];

    public static void main(String[] args) {
        int answer = (int)(math(n)%1234567l);
        System.out.println("answer = " + answer);
    }

    public static long math(int num) {
        if (num <= 0) return 0;
        if (num == 1) return 1;

        if (memo[num] != 0) {
            return memo[num];
        }

        memo[num] = math(num - 1)%1234567 + math(num - 2)%1234567;
        return memo[num];
    }

}
