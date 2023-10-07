package com.company.lv2.day_231007;

// https://school.programmers.co.kr/learn/courses/30/lessons/12985
public class Q2_예상대진표 {

//    private static int n = 8;
//    private static int a = 4;
//    private static int b = 7;

    private static int n = 4;
    private static int a = 2;
    private static int b = 3;

    public static void main(String[] args) {
        int answer = 0;

        while(a != b) {
            a = a/2 + a%2;
            b = b/2 + b%2;
            answer++;
        }

        System.out.println("answer = " + answer);
    }

}
