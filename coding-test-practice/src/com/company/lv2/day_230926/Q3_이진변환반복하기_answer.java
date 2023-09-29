package com.company.lv2.day_230926;

// https://school.programmers.co.kr/learn/courses/30/lessons/84512
public class Q3_이진변환반복하기_answer {

    private static String s = "110010101001";

    public static void main(String[] args) {
        int[] answer = new int[2];

        int temp;
        while( !s.equals("1") ) {
            answer[1] += s.length();
            s = s.replaceAll("0", "");
            temp = s.length();
            s = Integer.toBinaryString(temp);
            answer[0]++;
            answer[1] -= temp;
        }

        System.out.println("answer = " + answer[0]);
        System.out.println("answer = " + answer[1]);
    }
}