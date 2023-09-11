package com.company.lv1.day_230911;

// https://school.programmers.co.kr/learn/courses/30/lessons/12931
public class Q4_자릿수더하기 {

    private static long n = 123;

    public static void main(String[] args) {
        int answer = 0;
        while(n > 0) {
            answer += n%10;
            n/=10;
        }
        System.out.println("answer = " + answer);
    }
}
