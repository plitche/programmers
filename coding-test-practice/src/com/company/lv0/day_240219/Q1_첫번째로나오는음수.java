package com.company.lv0.day_240219;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/181896
public class Q1_첫번째로나오는음수 {

    private static int[] num_list = {12, 4, 15, 46, 38, -2, 15};
    // private static int[] num_list = {13, 22, 53, 24, 15, 6};

    public static void main(String[] args) {
        int answer = -1;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                answer = i;
                break;
            }
        }

        System.out.println("answer = " + answer);
    }
}
