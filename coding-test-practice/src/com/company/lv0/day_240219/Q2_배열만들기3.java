package com.company.lv0.day_240219;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/181895
public class Q2_배열만들기3 {

    private static int[] arr = {1, 2, 3, 4, 5};
    private static int[][] intervals = {{1, 3}, {0, 4}};

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int[] interval : intervals) {
            for (int i = interval[0]; i <= interval[1]; i++) {
                list.add(arr[i]);
            }
        }

        list.toArray(new Integer[0]);
        System.out.println("answer = " + list);
    }
}
