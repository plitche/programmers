package com.company.lv1.day_230915;

// https://school.programmers.co.kr/learn/courses/30/lessons/12912
public class Q3_두정수사이의합2 {

    private static int a = 3;
    private static int b = 5;

    public static void main(String[] args) {
        long answer = 0;

        answer = (a+b) * ((Math.abs(a-b)+1)/2);
        if (Math.abs(a-b)%2 != 1) answer += (a+b)/2;

        System.out.println("answer = " + answer);
    }

}
