package com.company.lv0.day_240219;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/181894
public class Q3_2의영역 {

    private static int[] arr = {1, 2, 1, 4, 5, 2, 9};

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (i < start) start = i;
                if (i > end) end = i;
            }
        }

        for (int i = start; i <= end; i++) {
            list.add(arr[i]);
        }

        Integer[] answer = list.toArray(new Integer[0]);
        if (answer.length == 0) answer = new Integer[]{-1};
        System.out.println("answer = " + list);
    }
}
