package com.company.lv0.day_240223;

import java.util.stream.IntStream;

// https://school.programmers.co.kr/learn/courses/30/lessons/181920
public class Q1_카운트업_stream {

    private static int start_num = 3;
    private static int end_num = 10;

    public static void main(String[] args) {
        int[] answer = IntStream.rangeClosed(start_num, end_num).toArray();

        for (int i : answer) {
            System.out.println("i = " + i);
        }
    }
}
