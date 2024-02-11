package com.company.lv0.day_240211;

import java.util.Locale;
import java.util.StringTokenizer;

// https://school.programmers.co.kr/learn/courses/30/lessons/181869
public class Q3_공백으로구분하기1 {

    private static String my_string = "i love you";
    // private static String my_string = "programmers";

    public static void main(String[] args) {
        String[] answer = my_string.split(" ");

        for (String s : answer) {
            System.out.println("s = " + s);
        }
    }
}
