package com.company.lv1.day_230910;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// https://school.programmers.co.kr/learn/courses/30/lessons/12940
public class Q8_제일작은수제거하기3 {

    // private static int[] arr = {4, 3, 2, 1};
    // private static int[] arr = {10};
    private static int[] arr = {4, 3, 2, 1, 5};

    public static void main(String[] args) {
        int min = Arrays.stream(arr).min().orElse(-1);
        List<Integer> filteredList = Arrays.stream(arr)
                .filter(x -> x != min)
                .boxed()
                .collect(Collectors.toList());

        Integer[] answer;
        if (filteredList.isEmpty()) answer = new Integer[]{-1};
        else answer = filteredList.toArray(new Integer[0]);

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }

}
