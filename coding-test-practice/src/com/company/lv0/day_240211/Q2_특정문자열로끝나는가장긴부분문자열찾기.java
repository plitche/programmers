package com.company.lv0.day_240211;

import java.util.Locale;

// https://school.programmers.co.kr/learn/courses/30/lessons/181872
public class Q2_특정문자열로끝나는가장긴부분문자열찾기 {

    private static String myString = "AbCdEFG";
    private static String pat = "dE";

//    private static String myString = "AAAAaaaa";
//    private static String pat = "a";

    public static void main(String[] args) {
        System.out.println(myString.substring(0, Math.min(myString.lastIndexOf(pat)+pat.length(), myString.length())));
    }
}
