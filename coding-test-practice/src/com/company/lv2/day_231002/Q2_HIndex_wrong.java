package com.company.lv2.day_231002;

import java.util.HashMap;

// https://school.programmers.co.kr/learn/courses/30/lessons/42747
public class Q2_HIndex_wrong {

    private static int[] citations = {3, 0, 6, 1, 5};

    public static void main(String[] args) {
        int answer = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<citations.length; i++) {
            int num = citations[i];
            for (int j=0; j<=num; j++) {
                map.put(j, map.getOrDefault(j, 0) + 1);
            }
        }

        for (Integer i : map.keySet()) {
            if (i == map.get(i)) {
                if (answer < i) {
                    answer = i;
                }
            }
        }

        System.out.println("answer = " + answer);
    }

}
