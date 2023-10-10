package com.company.lv2.day_231010;

// https://school.programmers.co.kr/learn/courses/30/lessons/12953
public class Q2_JadenCase문자열만들기_answer {

    private static String s = "3people unFollowed me";

    public static void main(String[] args) {
        String answer = "";
        String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for(String ss : sp) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }

        System.out.println("answer = " + answer);
    }

}
