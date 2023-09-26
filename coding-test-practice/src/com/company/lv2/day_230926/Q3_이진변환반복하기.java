package com.company.lv2.day_230926;

import java.util.Stack;

// https://school.programmers.co.kr/learn/courses/30/lessons/84512
public class Q3_이진변환반복하기 {

    private static String s = "110010101001";

    public static void main(String[] args) {
        int[] answer = new int[2];

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '0') {
                
            }
        }

        System.out.println("change = " + change);

    }

    public static String change(String s) {
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(s);

        while(num != 0) {
            sb.append(num%2);
            num/=2;
        }
        return sb.reverse().toString();
    }

}
