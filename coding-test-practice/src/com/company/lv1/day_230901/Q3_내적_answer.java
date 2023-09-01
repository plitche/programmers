package com.company.lv1.day_230901;

import java.util.stream.IntStream;

// https://school.programmers.co.kr/learn/courses/30/lessons/70128
public class Q3_내적_answer {

    private static int[] a = {1, 2, 3, 4};
    private static int[] b = {-3, -1, 0, 2};

    public static void main(String[] args) {
        int answer = IntStream.range(0, a.length).map(index -> a[index] * b[index]).sum();
        System.out.println("answer = " + answer);
    }

}
