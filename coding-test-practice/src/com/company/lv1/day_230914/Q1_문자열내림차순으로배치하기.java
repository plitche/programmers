package com.company.lv1.day_230914;

import java.util.Arrays;
import java.util.stream.Collectors;

// https://school.programmers.co.kr/learn/courses/30/lessons/12917
public class Q1_문자열내림차순으로배치하기 {

    private static String s = "Zbcdefg";

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        for (int i=chars.length-1; i>=0; i--) {
            sb.append(chars[i]);
        }

        System.out.println("sb = " + sb);
    }

}
