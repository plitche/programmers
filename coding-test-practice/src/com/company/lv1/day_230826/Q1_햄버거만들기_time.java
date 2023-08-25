package com.company.lv1.day_230826;

import java.util.ArrayList;

// https://school.programmers.co.kr/learn/courses/30/lessons/133502
public class Q1_햄버거만들기_time {

    private static int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};

    public static void main(String[] args) {
        int answer = 0;

        String temp = "";
        int length = ingredient.length;
        for (int i=0; i<length; i++) {
            int num = ingredient[i];

            if ((i == 0 && num != 1) || i == length-1 && num != 1) {
                continue;
            }
            temp += num;
        }

        String pattern = "1231";

        int index = temp.indexOf(pattern);
        while (index != -1) {
            String s1 = temp.substring(0, index);
            String s2 = temp.substring(index+4);

            temp = s1 + s2;
            index = temp.indexOf(pattern);

            answer += 1;
        }

        System.out.println("answer = " + answer);
    }
}
