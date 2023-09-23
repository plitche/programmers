package com.company.lv2.day_230923;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

// https://school.programmers.co.kr/learn/courses/30/lessons/138476
public class Q1_귤고르기_wrong {

    private static int k = 6;
    private static int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};

    public static void main(String[] args) {
        int answer = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : tangerine) {
            int temp = tangerine[i];
            map.put(temp, map.getOrDefault(temp, 0)+1);
        }

        System.out.println("map = " + map);

        int[][] arr = new int[map.size()][2];

        int idx = 0;
        for (Integer i : map.keySet()) {
             arr[idx][0] = i;
             arr[idx][1] = map.get(i);
             idx+=1;
        }

        Arrays.sort(arr, Comparator.comparingInt(x -> x[1]));

        for (int i=arr.length-1; i>=0; i--) {
            if (k < 0) {
                break;
            }
            k -= arr[i][1];
            answer+=1;
        }

        System.out.println("answer = " + answer);
    }

}
