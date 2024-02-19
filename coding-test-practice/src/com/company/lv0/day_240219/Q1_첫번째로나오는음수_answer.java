package com.company.lv0.day_240219;

import java.util.stream.IntStream;

// https://school.programmers.co.kr/learn/courses/30/lessons/181896
public class Q1_첫번째로나오는음수_answer {

    private static int[] num_list = {12, 4, 15, 46, 38, -2, 15};
    // private static int[] num_list = {13, 22, 53, 24, 15, 6};

    public static void main(String[] args) {
        int answer = IntStream.range(0, num_list.length).filter(i -> num_list[i] < 0).findFirst().orElse(-1);

        System.out.println("answer = " + answer);
    }
}
