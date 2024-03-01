package com.company.lv0.day_240301;

// https://school.programmers.co.kr/learn/courses/30/lessons/181933
public class Q4_flag에따라다른값반환 {

    private static int a = -4;
    private static int b = 7;
    private static boolean flag = true;

    public static void main(String[] args) {
        int answer = flag ? a + b : a - b;
        System.out.println("answer = " + answer);
    }
}
