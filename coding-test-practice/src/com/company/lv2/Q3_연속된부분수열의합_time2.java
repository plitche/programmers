package com.company.lv2;

import java.util.HashMap;

// https://school.programmers.co.kr/learn/courses/30/lessons/178870
public class Q3_연속된부분수열의합_time2 {

    private static int[] sequence = {1, 2, 3, 4, 5};
    private static int k = 7;

//    private static int[] sequence = {1, 1, 1, 2, 3, 4, 5};
//    private static int k = 5;

//    private static int[] sequence = {2, 2, 2, 2, 2};
//    private static int k = 6;

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int target = -1; // 시작 idx
        int min = Integer.MAX_VALUE; // 길이
        for (int i=0; i<sequence.length; i++) {
            for (int j=i; j<sequence.length; j++) {
                sum += sequence[j];
                if (sum == k) {
                    int length = j-i;
                    if (min > length) {
                        min = length;
                        target = i;
                    }
                } else if (sum > k) {
                    break;
                }
            }
            sum = 0;
        }

        int[] answer = {target, target+min};

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}
