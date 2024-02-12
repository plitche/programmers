package com.company.lv0.day_240212;

import java.util.ArrayList;
import java.util.List;

public class Q1_X사이의개수 {

    private static String myString = "oxooxoxxox";
//     private static String myString = "xabcxdefxghi";

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        char[] chars = myString.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'x') {
                list.add(count);
                count = 0;
            } else {
                count++;
            }
        }

        list.add(count);
        Integer[] answer = list.toArray(new Integer[0]);
        System.out.println("list = " + list);

    }
}
