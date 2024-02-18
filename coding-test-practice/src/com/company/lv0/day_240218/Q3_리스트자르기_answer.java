package com.company.lv0.day_240218;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/181898
public class Q3_리스트자르기_answer {

//    private static int n = 3;
//    private static int[] slicer = {1, 5, 2};
//    private static int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    private static int n = 1;
    private static int[] slicer = {1, 5, 2};
    private static int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        int start = n == 1 ? 0 : slicer[0];
        int end = n == 2 ? num_list.length - 1 : slicer[1];
        int step = n == 4 ? slicer[2] : 1;

        int[] answer = new int[(end - start + step) / step];
        for (int i = start, j = 0; i <= end; i += step) {
            answer[j++] = num_list[i];
        }

        for (int i : answer) {
            System.out.println("i = " + i);
        }
    }
}
