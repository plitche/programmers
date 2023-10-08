package com.company.lv2.day_231008;

// https://school.programmers.co.kr/learn/courses/30/lessons/12980
public class Q2_짝지어제거하기_time {

//    private static String s = "baabaa";
    private static String s = "cdcd";

    public static void main(String[] args) {
        int answer = 0;

        int idx = 0;
        while(true) {
            if (s.length() == 0 || idx == s.length()-1) break;

            if (s.charAt(idx) == s.charAt(idx+1)) {
                s = s.substring(0, idx) + s.substring(idx+2);
                idx = 0;
            } else {
                idx++;
            }
        }

        answer = s.length() == 0 ? 1 : 0;
        System.out.println("answer = " + answer);
    }

}
