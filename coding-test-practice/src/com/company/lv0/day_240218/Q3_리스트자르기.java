package com.company.lv0.day_240218;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/181898
public class Q3_리스트자르기 {

//    private static int n = 3;
//    private static int[] slicer = {1, 5, 2};
//    private static int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    private static int n = 1;
    private static int[] slicer = {1, 5, 2};
    private static int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        if (n == 1) {
            for (int i = 0; i <= slicer[1]; i++) {
                list.add(num_list[i]);
            }
        } else if (n == 2) {
            for (int i = slicer[0]; i < num_list.length; i++) {
                list.add(num_list[i]);
            }
        } else if (n == 3) {
            for (int i = slicer[0]; i <= slicer[1]; i++) {
                list.add(num_list[i]);
            }
        } else {
            for (int i = slicer[0]; i <= slicer[1]; i+=slicer[2]) {
                list.add(num_list[i]);
            }
        }

        list.toArray(new Integer[0]);
        System.out.println("answer = " + list);
    }
}
