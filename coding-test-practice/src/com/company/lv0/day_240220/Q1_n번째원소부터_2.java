package com.company.lv0.day_240220;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/181892
public class Q1_n번째원소부터_2 {

    private static int[] num_list = {2, 1, 6};
    private static int n = 3;

    public static void main(String[] args) {
        int[] ints = Arrays.copyOfRange(num_list, n - 1, num_list.length);

        for (int anInt : ints) {
            System.out.println("anInt = " + anInt);
        }
    }
}
