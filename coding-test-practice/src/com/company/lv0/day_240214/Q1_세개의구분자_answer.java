package com.company.lv0.day_240214;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/181862
public class Q1_세개의구분자_answer {

//    private static String myStr = "baconlettucetomato";
//    private static String myStr = "abcd";
    private static String myStr = "cabab";

//    private static String myStr = "eeeabcdabcabee";

    public static void main(String[] args) {
        String[] answer = Arrays.stream(myStr.split("[abc]+")).filter(str -> !str.isEmpty()).toArray(String[]::new);

        if (answer.length == 0) {
            answer = new String[]{"EMPTY"};
        }

        for (String s : answer) {
            System.out.println("s = " + s);
        }
    }
}
