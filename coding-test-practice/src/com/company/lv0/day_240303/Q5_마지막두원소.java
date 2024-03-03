package com.company.lv0.day_240303;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/181927
public class Q5_마지막두원소 {

    private static int[] num_list = {2, 1, 6};
//    private static int[] num_list = {5, 2, 1, 7, 5};

    public static void main(String[] args) {
        int last = num_list[num_list.length-1];
        int before = num_list[num_list.length-2];

        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
        answer[answer.length-1] = last > before ? last - before : last*2;

        for (int i : answer) {
            System.out.println("i = " + i);
        }
    }
}
