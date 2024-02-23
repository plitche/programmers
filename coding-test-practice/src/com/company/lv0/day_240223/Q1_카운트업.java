package com.company.lv0.day_240223;

import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/181920
public class Q1_카운트업 {

    private static int start_num = 3;
    private static int end_num = 10;

    public static void main(String[] args) {
        int[] answer = new int[end_num - start_num +1];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = start_num+i;
        }

        for (int i : answer) {
            System.out.println("i = " + i);
        }
    }
}
