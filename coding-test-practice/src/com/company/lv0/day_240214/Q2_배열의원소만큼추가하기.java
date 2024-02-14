package com.company.lv0.day_240214;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/181861
public class Q2_배열의원소만큼추가하기 {

    private static int[] arr = {5, 1, 4};
//    private static int[] arr = {6, 6};
//    private static int[] arr = {1};

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            for (int j = 0; j < i; j++) list.add(i);
        }

        Integer[] answer = list.toArray(new Integer[list.size()]);
        for (int s : answer) {
            System.out.println("s = " + s);
        }
    }
}
