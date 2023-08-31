package com.company.lv1.day_230831;

import java.util.HashMap;

// https://school.programmers.co.kr/learn/courses/30/lessons/81301
public class Q4_숫자문자열과영단어 {

    private static String s = "one4seveneight";

    public static void main(String[] args) {
        int answer = 0;

        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i=0; i<10; i++) {
            s = s.replace(words[i], num[i]);
        }

        answer = Integer.parseInt(s);
        System.out.println("answer = " + answer);
    }
}
