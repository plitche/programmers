package com.company.lv1.day_230911;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/12934
public class Q3_자연수뒤집어배열로만들기 {

    private static long n = 12345;

    public static void main(String[] args) {
        int[] answer = new int[String.valueOf(n).length()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = (int)(n%10);
            n /= 10;
        }

        System.out.println("answer = " + answer);
    }
}
