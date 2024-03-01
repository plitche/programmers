package com.company.lv0.day_240301;

// https://school.programmers.co.kr/learn/courses/30/lessons/181936
public class Q1_공배수 {

    private static int number = 60;
    private static int n = 2;
    private static int m = 3;

//    private static int number = 55;
//    private static int n = 10;
//    private static int m = 5;

    public static void main(String[] args) {
        int answer = 0;
        if (number%n == 0 && number%m == 0) answer = 1;

        System.out.println("answer = " + answer);
    }
}
