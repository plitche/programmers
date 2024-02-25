package com.company.lv0.day_240225;

// https://school.programmers.co.kr/learn/courses/30/lessons/181908
public class Q5_접미사인지확인하기 {

    private static String my_string = "banana";
    private static String is_suffix = "ana";

    public static void main(String[] args) {
        int answer = 0;

        for (int i = 0; i < my_string.length(); i++) {
            String temp = my_string.substring(i);
            if (temp.equals(is_suffix)) {
                answer = 1;
                break;
            }
        }

        System.out.println("answer = " + answer);
    }
}
