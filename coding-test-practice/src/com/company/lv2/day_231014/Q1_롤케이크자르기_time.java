package com.company.lv2.day_231014;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// https://school.programmers.co.kr/learn/courses/30/lessons/132265
public class Q1_롤케이크자르기_time {

    //private static int[] topping = {1, 2, 1, 3, 1, 4, 1, 2};
    private static int[] topping = {1, 2, 3, 1, 4};

    public static void main(String[] args) {
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for (int i=0; i<topping.length; i++) {
            map.put(topping[i], map.getOrDefault(topping[i] ,0) + 1);
        }

        for (int i = 0; i <topping.length; i++) {
            int each = topping[i];

            set.add(each);
            map.put(each, map.get(each)-1);
            if (map.get(each) == 0) {
                map.remove(each);
            }
            if (set.size() == map.size()) {
                answer++;
            }

        }

        System.out.println("answer = " + answer);
    }

}
