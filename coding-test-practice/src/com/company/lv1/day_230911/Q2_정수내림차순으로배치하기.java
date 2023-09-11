package com.company.lv1.day_230911;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.stream.Collectors;

// https://school.programmers.co.kr/learn/courses/30/lessons/12934
public class Q2_정수내림차순으로배치하기 {

    private static long n = 118372;

    public static void main(String[] args) {
        Integer[] arr = String.valueOf(n).chars().mapToObj(Character::getNumericValue).toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        String s = Arrays.stream(arr).map(Objects::toString).collect(Collectors.joining());
        System.out.println("answer = " + s);
    }
}
