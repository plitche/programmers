package com.company.lv0.day_240213;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/181866
public class Q1_문자열잘라서정렬하기_stream {

//    private static String myString = "axbxcxdx";
     private static String myString = "dxccxbbbxaaaa";
//     private static String myString = "xxxx";
//     private static String myString = "xaxbxcx";

    public static void main(String[] args) {
        String[] answer = Arrays.stream(myString.split("x")).filter(s -> !s.isEmpty()).sorted().toArray(String[]::new);

        for (String s : answer) {
            System.out.println("s = " + s);
        }

    }
}
