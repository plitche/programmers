package com.company.lv2.day_230926;

import java.util.Stack;

// https://school.programmers.co.kr/learn/courses/30/lessons/84512
public class Q3_이진변환반복하기 {

    private static String s = "110010101001";

    public static void main(String[] args) {
        int[] answer = new int[2];

        int count = 0;
        while(!s.equals("1")) {
            while(s.indexOf("0") != -1) {
                s = s.replaceFirst("0", "");
                count += 1;
            }

            s = change(s.length());
            answer[0] += 1;
        }

        answer[1] = count;

        System.out.println("answer = " + answer[0]);
        System.out.println("answer = " + answer[1]);
    }

    public static String change(int num) {
        StringBuilder sb = new StringBuilder();

        while(num != 0) {
            sb.append(num%2);
            num/=2;
        }

        return sb.reverse().toString();
    }

}