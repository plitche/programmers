package com.company.lv0.day_240213;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/181865
public class Q2_간단한식계산하기 {

//     private static String binomial = "43 + 12";
//     private static String binomial = "0 - 7777";
     private static String binomial = "40000 * 40000";

    public static void main(String[] args) {
        int answer = 0;

        if (binomial.contains("+")) {
            String[] split = binomial.split("\\+");
            answer = Integer.parseInt(split[0].trim()) + Integer.parseInt(split[1].trim());
        } else if (binomial.contains("-")) {
            String[] split = binomial.split("\\-");
            answer = Integer.parseInt(split[0].trim()) - Integer.parseInt(split[1].trim());
        } else {
            String[] split = binomial.split("\\*");
            answer = Integer.parseInt(split[0].trim()) * Integer.parseInt(split[1].trim());
        }

        System.out.println("answer = " + answer);
    }
}
