package com.company.lv0.day_240215;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/181900
public class Q1_글자지우기_wrong {

    private static String my_string = "apporoograpemmemprs";
    private static int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};

    public static void main(String[] args) {
        Arrays.sort(indices);

        for (int i = 0; i < indices.length; i++) {
            char c = my_string.charAt(indices[i]);

        }

        System.out.println("my_string = " + my_string);
    }
}
