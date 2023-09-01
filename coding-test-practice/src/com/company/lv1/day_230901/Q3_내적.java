package com.company.lv1.day_230901;

// https://school.programmers.co.kr/learn/courses/30/lessons/70128
public class Q3_내적 {

    private static int[] a = {1, 2, 3, 4};
    private static int[] b = {-3, -1, 0, 2};

    public static void main(String[] args) {
        int answer = 0;

        for (int i=0; i<a.length; i++) {
            answer += a[i] * b[i];
        }

        System.out.println("answer = " + answer);
    }

}
