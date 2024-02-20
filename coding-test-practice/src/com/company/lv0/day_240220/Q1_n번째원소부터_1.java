package com.company.lv0.day_240220;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/181892
public class Q1_n번째원소부터_1 {

    private static int[] num_list = {2, 1, 6};
    private static int n = 3;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = n-1; i < num_list.length; i++) {
            list.add(num_list[i]);
        }

        list.toArray(new Integer[0]);
        System.out.println("answer = " + list);
    }
}
