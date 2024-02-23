package com.company.lv0.day_240223;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/181918
public class Q3_배열만들기4 {

    private static int[] arr = {1, 4, 2, 5, 3};

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            System.out.println("list = " + list);
            if (list.size() == 0) {
                list.add(arr[i]);
            } else {
                if (arr[i] > list.get(list.size()-1)) {
                    list.add(arr[i]);
                } else {
                    list.remove(list.size()-1);
                    i--;
                }
            }
        }

        list.toArray(new Integer[0]);
        System.out.println("i = " + list);
    }
}
