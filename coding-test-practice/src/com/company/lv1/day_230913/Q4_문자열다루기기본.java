package com.company.lv1.day_230913;

// https://school.programmers.co.kr/learn/courses/30/lessons/12918
public class Q4_문자열다루기기본 {

    private static String s = "a234";

    public static void main(String[] args) {
        boolean answer = true;

        if (s.length() == 4 || s.length() == 6) {
            for (int i=0; i<s.length(); i++) {
                char c = s.charAt(i);
                if (c < '0' || c > '9') {
                    answer = false;
                    break;
                }

            }
        } else {
            answer = false;
        }

        System.out.println("answer = " + answer);
    }
}
