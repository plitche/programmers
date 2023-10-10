package com.company.lv2.day_231010;

import java.util.Locale;

// https://school.programmers.co.kr/learn/courses/30/lessons/12953
public class Q2_JadenCase문자열만들기 {

    private static String s = "3people unFollowed me";

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        boolean isFirst = true;

        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);

            if (c >= '0' && c <= '9') {
                sb.append(c);
            } else {
                if (isFirst) {
                    sb.append(String.valueOf(c).toUpperCase());
                } else {
                    sb.append(String.valueOf(c).toLowerCase());
                }
            }

            if (c == ' ') isFirst = true;
            else isFirst = false;
        }

        System.out.println("answer = " + sb.toString());
    }

}
