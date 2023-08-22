package com.company.lv1.day_230821;

// https://school.programmers.co.kr/learn/courses/30/lessons/140108
public class Q3_문자열나누기_answer {

    private static String s = "abaa";
    //private static String s = "banana";
    //private static String s = "abracadabra";
    //private static String s = "aaabbaccccabba";

    public static void main(String[] args) {
        char prev = '1';
        int same = 0, different = 0, answer = 0;
        for (char c : s.toCharArray()) {
            if (prev == '1') {
                prev = c;
                same++;
                answer++;
            } else if (prev == c) {
                same++;
            } else {
                different++;
            }

            if (same == different) {
                prev = '1';
                same = 0; different = 0;
            }
        }

        System.out.println("answer : " + answer);
    }
}
