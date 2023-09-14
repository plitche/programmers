package com.company.lv1.day_230914;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/12917
public class Q1_문자열내림차순으로배치하기_answer {

    private static String s = "Zbcdefg";

    public static void main(String[] args) {
        char[] sol = s.toCharArray();
        Arrays.sort(sol);

        System.out.println(new StringBuilder(new String(sol)).reverse().toString());
    }

}
