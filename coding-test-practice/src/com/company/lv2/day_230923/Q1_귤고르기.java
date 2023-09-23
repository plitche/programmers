package com.company.lv2.day_230923;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

// https://school.programmers.co.kr/learn/courses/30/lessons/138476
public class Q1_귤고르기 {

    private static int k = 6;
    private static int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};

    public static void main(String[] args) {
        int answer = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : tangerine) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        int[] arr = new int[map.size()];

        int idx = 0;
        for (Integer i : map.keySet()) {
            arr[idx] = map.get(i);
            idx++;
        }

        Arrays.sort(arr);

        for (int i=arr.length-1; i>=0; i--) {
            k -= arr[i];
            answer++;
            if (k <= 0) break;
        }

        System.out.println("answer = " + answer);
    }

}
