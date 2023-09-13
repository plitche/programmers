package com.company.lv1.day_230913;

// https://school.programmers.co.kr/learn/courses/30/lessons/12918
public class Q4_문자열다루기기본_answer2 {

    private static String s = "a234";

    public static void main(String[] args) {
        boolean answer = true;

        if (s.length() == 4 || s.length() == 6) answer =  s.matches("(^[0-9]*$)");
        answer = false;

        System.out.println("answer = " + answer);
    }
}
