package com.company.lv0.day_240301;

// https://school.programmers.co.kr/learn/courses/30/lessons/181935
public class Q2_홀짝에따라다른값반환하기_2 {

    private static int n = 7;
//    private static int n = 10;

    public static void main(String[] args) {
        int answer = 0;
        for (int i = n; i > 0; i-=2) {
            if(n%2 == 0) answer += i*i;
            else answer += i;
        }

        System.out.println("answer = " + answer);
    }
}
