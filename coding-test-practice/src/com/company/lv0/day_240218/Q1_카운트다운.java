package com.company.lv0.day_240218;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/181899
public class Q1_카운트다운 {

    private static int start_num = 10;
    private static int end_num = 3;

    public static void main(String[] args) {
        List<Integer> answer = new ArrayList<>();

        int i = start_num;
        while (start_num >= end_num) {
            answer.add(start_num);
            start_num--;
        }

        answer.toArray(new Integer[0]);
        System.out.println("answer = " + answer);
    }
}
