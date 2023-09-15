package com.company.lv1.day_230915;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

// https://school.programmers.co.kr/learn/courses/30/lessons/12912
public class Q4_나누어떨어지는숫자배열 {

//    private static int[] arr = {5, 9, 7, 10};
//    private static int divisor = 5;

    private static int[] arr = {2, 36, 1, 3};
    private static int divisor = 1;


    public static void main(String[] args) {
        int[] answer = Arrays.stream(arr).filter(m -> m%divisor == 0).toArray();
        Arrays.sort(answer);
        if (answer.length == 0) answer = new int[]{-1};

        for (int i : answer) {
            System.out.println("i = " + i);
        }

    }

}
