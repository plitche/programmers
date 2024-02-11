package com.company.lv0.day_240211;

import java.util.Locale;

// https://school.programmers.co.kr/learn/courses/30/lessons/181873
public class Q1_특정한문자를대문자로바꾸기 {

    private static String my_string = "programmers";
    private static String alp = "p";

    public static void main(String[] args) {
        System.out.println(my_string.replace(alp, alp.toUpperCase(Locale.ROOT)));
    }
}
