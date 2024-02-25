package com.company.lv0.day_240225;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/181912
public class Q1_배열만들기5 {

    private static String[] intStrs = {"0123456789","9876543210","9999999999999"};
    private static int k = 50000;
    private static int s = 5;
    private static int l = 5;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (String i : intStrs) {
            int num = Integer.parseInt(i.substring(s, s + l));
            if (num > k) {
                list.add(num);
            }
        }

        list.toArray(new Integer[0]);
        System.out.println("answer = " + list);
    }
}
