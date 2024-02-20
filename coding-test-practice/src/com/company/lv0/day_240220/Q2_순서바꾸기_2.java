package com.company.lv0.day_240220;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/181891
public class Q2_순서바꾸기_2 {

    private static int[] num_list = {2, 1, 6};
    private static int n = 1;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = n; i < num_list.length; i++) list.add(num_list[i]);
        for (int i = 0; i < n; i++) list.add(num_list[i]);

        list.toArray(new Integer[0]);
        System.out.println("list = " + list);
    }
}
