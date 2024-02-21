package com.company.lv0.day_240221;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/181888
public class Q2_n개간격의원소들 {

//    private static int[] num_list = {4, 2, 6, 1, 7, 6};
//    private static int n = 2;

    private static int[] num_list = {4, 2, 6, 1, 7, 6};
    private static int n = 4;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num_list.length; i+=n) {
            list.add(num_list[i]);
        }

        list.toArray(new Integer[0]);
        System.out.println("list = " + list);
    }
}
