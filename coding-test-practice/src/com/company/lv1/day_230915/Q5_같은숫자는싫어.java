package com.company.lv1.day_230915;

import java.util.ArrayList;

// https://school.programmers.co.kr/learn/courses/30/lessons/12906
public class Q5_같은숫자는싫어 {

    private static int[] arr = {1,1,3,3,0,1,1};

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int temp = -1;
        for (Integer i : arr) {
            if (temp != i) {
                list.add(i);
                temp = i;
            }
        }

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();

        for (int i : answer) {
            System.out.println("i = " + i);
        }

    }

}
