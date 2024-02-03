package com.company.lv0.day_240203;

// https://school.programmers.co.kr/learn/courses/30/lessons/181880
public class Q1_1로만들기_1 {

    private static int[] num_list = {12, 4, 15, 1, 14};

    public static void main(String[] args) {
        int answer = 0;

        for (int i : num_list) {
            while (i != 1) {
                i /= 2;
                answer++;
            }
        }

        System.out.println("answer = " + answer);
    }
}
