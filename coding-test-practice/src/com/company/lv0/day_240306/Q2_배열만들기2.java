package com.company.lv0.day_240306;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/181921
public class Q2_배열만들기2 {

    private static int i = 1;
    private static int r = 555;

//    private static int i = 10;
//    private static int r = 20;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int j = i; j <= r; j++) {
            String a = String.valueOf(j)
                    .replace("5", "")
                    .replace("0", "");

            if (a.length() == 0) {
                list.add(j);
            }
        }

        Integer[] integers = list.size() == 0 ? new Integer[]{-1} : list.toArray(new Integer[0]);
        System.out.println("list = " + list);
    }
}
