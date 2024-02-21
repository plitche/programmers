package com.company.lv0.day_240221;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/181889
public class Q1_n번쨰원소까지 {

//    private static int[] num_list = {2, 1, 6};
//    private static int n = 1;

    private static int[] num_list = {5, 2, 1, 7, 5};
    private static int n = 3;

    public static void main(String[] args) {
        int[] ints = Arrays.copyOfRange(num_list, 0, n);

        for (int anInt : ints) {
            System.out.println("anInt = " + anInt);
        }
    }
}
