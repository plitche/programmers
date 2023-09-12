package com.company.lv1.day_230912;

// https://school.programmers.co.kr/learn/courses/30/lessons/12926
public class Q4_문자열을정수로바꾸기 {

    //private static String s = "1234";
    //private static String s = "+1234";
    private static String s = "-1234";

    public static void main(String[] args) {
        int answer = 0;
        if (s.charAt(0) == '+') {
            answer = Integer.parseInt(s.substring(1));
        } else if (s.charAt(0) == '-') {
            answer = Integer.parseInt(s.substring(1)) * -1;
        } else {
            answer = Integer.parseInt(s);
        }

        System.out.println(answer);
    }
}
