package com.company.lv2.day_231010;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/12939
public class Q5_최댓값과최솟값2 {

    //private static String s = "1 2 3 4";
//    private static String s = "1 -1 -4 4";
//    private static String s = "-1 -2 -3 -4";
    private static String s = "-12 -10 5";

    public static void main(String[] args) {
        String[] split = s.split(" ");

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i=0; i<split.length; i++) {
            int num = Integer.parseInt(split[i]);

            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("answer = " + min + " " + max);
    }

}
