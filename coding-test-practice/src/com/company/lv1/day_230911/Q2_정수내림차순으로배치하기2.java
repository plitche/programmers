package com.company.lv1.day_230911;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.stream.Collectors;

// https://school.programmers.co.kr/learn/courses/30/lessons/12934
public class Q2_정수내림차순으로배치하기2 {

    private static long n = 118372;

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Integer[] arr = String.valueOf(n).chars().mapToObj(Character::getNumericValue).toArray(Integer[]::new);
        Arrays.sort(arr);
        for (int i=arr.length-1; i>=0; i--) sb.append(arr[i]);
        System.out.println("Long.parseLong(sb.toString()) = " + Long.parseLong(sb.toString()));
    }
}
