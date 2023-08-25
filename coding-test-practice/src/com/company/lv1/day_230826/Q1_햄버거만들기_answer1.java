package com.company.lv1.day_230826;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

// https://school.programmers.co.kr/learn/courses/30/lessons/133502
public class Q1_햄버거만들기_answer1 {

    private static int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};

    public static void main(String[] args) {
        int answer = 0;

        int[] stack = new int[ingredient.length];
        int sp = 0;
        for (int i : ingredient) {
            stack[sp++] = i;
            if
            (
                sp >= 4 &&
                stack[sp - 1] == 1 &&
                stack[sp - 2] == 3 &&
                stack[sp - 3] == 2 &&
                stack[sp - 4] == 1
            )
            {
                sp -= 4;
                answer++;
            }
        }

        System.out.println("answer = " + answer);
    }
}
