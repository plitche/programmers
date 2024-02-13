package com.company.lv0.day_240213;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/181866
public class Q1_문자열잘라서정렬하기_answer {

//    private static String myString = "axbxcxdx";
     private static String myString = "dxccxbbbxaaaa";
//     private static String myString = "xxxx";
//     private static String myString = "xaxbxcx";

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);

            if (c == 'x') {
                if (!sb.toString().equals("")) {
                    list.add(sb.toString());
                    sb = new StringBuilder();
                }
            } else {
                sb.append(c);
            }
        }

        if (!sb.toString().equals("")) list.add(sb.toString());

        String[] answer = list.toArray(new String[0]);
        Arrays.sort(answer);

        for (String s : answer) {
            System.out.println("s = " + s);
        }

    }
}
