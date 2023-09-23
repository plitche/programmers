package com.company.lv2.day_230923;

import java.util.HashSet;
import java.util.Set;

// https://school.programmers.co.kr/learn/courses/30/lessons/131701
public class Q2_연속부분수열합의개수 {

    private static int[] elements = {7, 9, 1, 1, 4};

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for (int i=1; i<=elements.length; i++) {
            for (int j=0; j<elements.length; j++) {
                int sum = sum(elements, j, i);
                set.add(sum);
            }
        }

        System.out.println("answer = " + set.size());
    }

    public static int sum(int[] arr, int start, int length) {
        int sum = 0;

        for (int i=start; i<arr.length; i++) {
            if (i >= start + length) break;
            sum += arr[i];
        }
        if (arr.length < start + length) {
            for (int i=0; i<(start + length) - arr.length; i++) {
                sum += arr[i];
            }
        }
        return sum;
    }

}