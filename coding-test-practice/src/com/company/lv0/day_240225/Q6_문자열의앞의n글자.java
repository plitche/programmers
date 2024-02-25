package com.company.lv0.day_240225;

// https://school.programmers.co.kr/learn/courses/30/lessons/181907
public class Q6_문자열의앞의n글자 {

    private static String my_string = "ProgrammerS123";
    private static int n = 11;

    public static void main(String[] args) {
        System.out.println("answer = " + my_string.substring(0, n));
    }
}
