package com.company.lv0.day_240306;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/181921
public class Q2_배열만들기2_answer {

    private static int l = 1;
    private static int r = 555;

//    private static int l = 10;
//    private static int r = 20;

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < 64; i++) {
            int num = Integer.parseInt(Integer.toBinaryString(i)) * 5;
            if (l <= num && num <= r)
                list.add(num);
        }

        int[] arr = list.isEmpty() ? new int[]{-1} : list.stream().mapToInt(i -> i).toArray();
        System.out.println("list = " + list);
    }
}
