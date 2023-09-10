package com.company.lv1.day_230910;

import java.util.*;
import java.util.stream.Collectors;

// https://school.programmers.co.kr/learn/courses/30/lessons/12940
public class Q8_제일작은수제거하기2 {

    // private static int[] arr = {4, 3, 2, 1};
    // private static int[] arr = {10};
    private static int[] arr = {4, 3, 2, 1, 5};

    public static void main(String[] args) {
        Integer[] answer;
        if(arr.length == 1) {
            answer = new Integer[1];
            answer[0] = -1;
        } else {
            List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toCollection(ArrayList::new));
            answer = list.stream().filter(m -> m != Collections.min(list)).collect(Collectors.toList()).toArray(new Integer[arr.length-1]);
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }

}
