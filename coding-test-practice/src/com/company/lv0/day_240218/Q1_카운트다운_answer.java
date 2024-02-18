package com.company.lv0.day_240218;

import java.util.stream.IntStream;

// https://school.programmers.co.kr/learn/courses/30/lessons/181899
public class Q1_카운트다운_answer {

    private static int start_num = 10;
    private static int end_num = 3;

    public static void main(String[] args) {
        int[] ints = IntStream.rangeClosed(-start_num, -end_num).map(i -> -i).toArray();

        for (int anInt : ints) {
            System.out.println("anInt = " + anInt);
        }
    }
}
