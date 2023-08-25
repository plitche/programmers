package com.company.lv1.day_230826;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

// https://school.programmers.co.kr/learn/courses/30/lessons/133502
public class Q1_햄버거만들기 {

    private static int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};

    public static void main(String[] args) {
        int answer = 0;

        ArrayList<Integer> list = new ArrayList<>(
                Arrays.stream(ingredient).boxed().collect(Collectors.toList())
        );

        for (int i=0; i<=list.size()-4; i++) {
            if (list.get(i) == 1 && list.get(i+1) == 2 && list.get(i+2) == 3 && list.get(i+3) == 1) {
                answer += 1;
                list.remove(i+3);
                list.remove(i+2);
                list.remove(i+1);
                list.remove(i);
                i -= 4;
            }

            i = i < -1 ? -1 : i;
        }

        System.out.println("answer = " + answer);
    }
}
