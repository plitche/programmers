package com.company.lv1.day_230914;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// https://school.programmers.co.kr/learn/courses/30/lessons/12917
public class Q1_문자열내림차순으로배치하기_answer2 {

    private static String s = "Zbcdefg";

    public static void main(String[] args) {
        System.out.println(
                Stream.of(s.split(""))
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.joining())
        );

    }

}
