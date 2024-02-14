package com.company.lv0.day_240214;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// https://school.programmers.co.kr/learn/courses/30/lessons/181861
public class Q2_배열의원소만큼추가하기_answer {

    private static int[] arr = {5, 1, 4};
//    private static int[] arr = {6, 6};
//    private static int[] arr = {1};

    public static void main(String[] args) {
        List<Integer> answer = Arrays.stream(arr).boxed().flatMap(num -> Collections.nCopies(num, num).stream()).collect(Collectors.toList());
        for (int s : answer) {
            System.out.println("s = " + s);
        }
    }
}
