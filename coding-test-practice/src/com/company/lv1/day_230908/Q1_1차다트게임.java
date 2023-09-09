package com.company.lv1.day_230908;

import java.util.HashMap;

// https://school.programmers.co.kr/learn/courses/30/lessons/17682
public class Q1_1차다트게임 {

    private static String dartResult = "1S2D*3T";

    public static void main(String[] args) {
        int answer = 0;

        char[] chars = dartResult.toCharArray();
        int number = 0;
        int power = 0;
        int option = 0;

        for (int i=0; i<chars.length; i+=2) {
            char a = chars[i];

            if (i != 0 && a >= '1' && a <= '9') {
//                answer
            } else {
                if (number == 0) {
                    number = a - '0';
                } else if (power == 0) {
                    power = a == 'S' ? 1 : a == 'D' ? 2 : 3;
                } else {
//                    option = a == '*' ?
                }
            }

        }


        System.out.println("answer = " + answer);
    }

}
