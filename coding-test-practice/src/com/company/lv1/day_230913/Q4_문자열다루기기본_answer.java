package com.company.lv1.day_230913;

// https://school.programmers.co.kr/learn/courses/30/lessons/12918
public class Q4_문자열다루기기본_answer {

    private static String s = "a234";

    public static void main(String[] args) {
        boolean answer = true;

        if(s.length() == 4 || s.length() == 6){
            try{
                int x = Integer.parseInt(s);
                answer = true;
            } catch(NumberFormatException e){
                answer = false;
            }
        }
        else answer = false;

        System.out.println("answer = " + answer);
    }
}
