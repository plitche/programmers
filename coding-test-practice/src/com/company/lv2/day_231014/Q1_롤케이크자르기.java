package com.company.lv2.day_231014;

import java.util.HashSet;
import java.util.Set;

// https://school.programmers.co.kr/learn/courses/30/lessons/132265
public class Q1_롤케이크자르기 {

    //private static int[] topping = {1, 2, 1, 3, 1, 4, 1, 2};
    private static int[] topping = {1, 2, 3, 1, 4};

    public static void main(String[] args) {
        int answer = 0;

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i=0; i<topping.length; i++) {
            set1.clear();
            set2.clear();
            for (int j=0; j<i; j++) set1.add(topping[j]);
            for (int j=i; j<topping.length; j++) set2.add(topping[j]);
            if (set1.size() == set2.size()) answer++;
        }

        System.out.println("answer = " + answer);
    }

}
