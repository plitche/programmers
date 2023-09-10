package com.company.lv1.day_230910;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/12944
public class Q4_평균구하기2 {

    private static int[] arr = {1, 2, 3, 4};
    public static void main(String[] args) {
        double answer = Arrays.stream(arr).sum();;
        System.out.println("answer = " + answer/arr.length);
    }

}
