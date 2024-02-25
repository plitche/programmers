package com.company.lv0.day_240225;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/181909
public class Q4_접미사배열 {

    private static String my_string = "banana";

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            String temp = my_string.substring(i);

            if (!temp.equals("") && !list.contains(temp)) {
                list.add(temp);
            }
        }

        String[] answer = list.toArray(new String[0]);
        Arrays.sort(answer, String.CASE_INSENSITIVE_ORDER);
        System.out.println("answer = " + list);
    }
}
