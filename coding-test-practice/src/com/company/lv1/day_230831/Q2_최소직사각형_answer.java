package com.company.lv1.day_230831;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/86491
public class Q2_최소직사각형_answer {

    private static int[][] sizes = {
            {60, 50},
            {30, 70},
            {60, 30},
            {80, 40}
    };

    public static void main(String[] args) {
        int length = 0, height = 0;
        for (int[] card : sizes) {
            length = Math.max(length, Math.max(card[0], card[1]));
            height = Math.max(height, Math.min(card[0], card[1]));
        }
        int answer = length * height;
        System.out.println("answer = " + answer);
    }
}
