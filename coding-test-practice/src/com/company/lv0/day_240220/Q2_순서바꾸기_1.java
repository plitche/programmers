package com.company.lv0.day_240220;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/181891
public class Q2_순서바꾸기_1 {

    private static int[] num_list = {2, 1, 6};
    private static int n = 1;

    public static void main(String[] args) {
        int[] a = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] b = Arrays.copyOfRange(num_list, 0, n);

        List<Integer> list = new ArrayList<>();
        for (int num : a) list.add(num);
        for (int num : b) list.add(num);

        list.toArray(new Integer[0]);
        System.out.println("list = " + list);
    }
}
