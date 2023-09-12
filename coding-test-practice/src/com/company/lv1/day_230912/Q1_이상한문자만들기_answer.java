package com.company.lv1.day_230912;

// https://school.programmers.co.kr/learn/courses/30/lessons/12930
public class Q1_이상한문자만들기_answer {

    //private static String s = "try hello world";
    //private static String s = "AA aa ZZ zz";
    private static String s = "aa  a   ";

    public static void main(String[] args) {
        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
        }

        System.out.println("sb = " + answer);
    }
}
