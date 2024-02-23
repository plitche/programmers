package com.company.lv0.day_240223;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/181919
public class Q2_콜라츠수열만들기 {

    private static int n = 10;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        while(n != 1) {
            list.add(n);
            if (n%2 == 0) n = n/2;
            else n = n* 3 + 1;
        }

        list.add(1);
        list.toArray(new Integer[0]);

        System.out.println("i = " + list);
    }
}
