package com.company.lv0.day_240225;

// https://school.programmers.co.kr/learn/courses/30/lessons/181906
public class Q7_접두사인지확인하기 {

    private static String my_string = "banana";
    private static String is_prefix = "ban";

    public static void main(String[] args) {
        int answer = 0;

        for (int i = 0; i < my_string.length(); i++) {
            String temp = my_string.substring(0, i);
            if (temp.equals(is_prefix)) {
                answer = 1;
                break;
            }
        }

        System.out.println("answer = " + answer);
    }
}
