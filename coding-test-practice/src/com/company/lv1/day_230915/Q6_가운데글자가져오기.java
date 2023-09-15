package com.company.lv1.day_230915;

import java.util.ArrayList;

// https://school.programmers.co.kr/learn/courses/30/lessons/12903
public class Q6_가운데글자가져오기 {

    //private static String s = "abcde";
    private static String s = "qwer";

    public static void main(String[] args) {
        String answer = "";
        if (s.length()%2 == 0) {
            answer = s.charAt(s.length()/2-1) + String.valueOf(s.charAt(s.length()/2));
        } else {
            answer = String.valueOf(s.charAt(s.length()/2));
        }

        System.out.println("answer = " + answer);
    }

}
