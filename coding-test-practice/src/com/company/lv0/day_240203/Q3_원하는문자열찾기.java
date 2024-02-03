package com.company.lv0.day_240203;

import java.util.Locale;

// https://school.programmers.co.kr/learn/courses/30/lessons/181878
public class Q3_원하는문자열찾기 {

//    private static String myString = "AbCdEfG";
//    private static String pat = "aBc";

    private static String myString = "aaAA";
    private static String pat = "aaaaa";

    public static void main(String[] args) {
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        System.out.println(myString.contains(pat) ? 1 : 0);
    }
}
