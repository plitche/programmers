package com.company.lv0.day_240213;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/181866
public class Q1_문자열잘라서정렬하기_wrong {

//    private static String myString = "axbxcxdx";
//     private static String myString = "dxccxbbbxaaaa";
//     private static String myString = "xxxx";
     private static String myString = "xaxbxcx";

    public static void main(String[] args) {
        myString = myString.replaceAll("xx", "x").replaceAll("x", " ").trim();
        String[] xes = myString.split(" ");
        Arrays.sort(xes);
        for (String s : xes) {
            System.out.println("s = " + s);
        }

    }
}
