package com.company.lv0.day_240218;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/181898
public class Q2_가까운1찾기 {

    private static int[] arr = {0, 0, 0, 1};
    private static int idx = 1;

    public static void main(String[] args) {
        int answer = -1;

        for (int i = idx; i < arr.length; i++) {
            if (i >= idx && arr[i] == 1) {
                answer = i;
                break;
            }
        }

        System.out.println("answer = " + answer);
    }
}
