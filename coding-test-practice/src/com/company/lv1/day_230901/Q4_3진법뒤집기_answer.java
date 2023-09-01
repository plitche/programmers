package com.company.lv1.day_230901;

// https://school.programmers.co.kr/learn/courses/30/lessons/70128
public class Q4_3진법뒤집기_answer {

    private static int n = 45;

    public static void main(String[] args) {
        String answer = "";

        while(n > 0){
            answer = (n % 3) + answer;
            n /= 3;
        }
        answer = new StringBuilder(answer).reverse().toString();

        System.out.println("answer = " + answer);
    }

}
