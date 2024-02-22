package com.company.lv0.day_240222;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/181884
public class Q1_n보다커질때까지더하기 {

    private static int[] numbers = {34, 5, 71, 29, 100, 34};
    private static int n = 123;

//    private static int[] num_list = {58, 44, 27, 10, 100};
//    private static int n = 139;

    public static void main(String[] args) {
        int answer = 0;

        for (int number : numbers) {
            answer += number;
            if (answer > n) break;
        }

        System.out.println("answer = " + answer);
    }
}
