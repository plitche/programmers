package com.company.lv2.day_230917;

import java.util.HashMap;

// https://school.programmers.co.kr/learn/courses/30/lessons/178870
public class Q3_연속된부분수열의합_time {

//    private static int[] sequence = {1, 2, 3, 4, 5};
//    private static int k = 7;

    private static int[] sequence = {1, 1, 1, 2, 3, 4, 5};
    private static int k = 5;

//    private static int[] sequence = {2, 2, 2, 2, 2};
//    private static int k = 6;

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        for (int i=0; i<sequence.length; i++) {
            for (int j=i; j<sequence.length; j++) {
                sum += sequence[j];
                if (sum == k) {
                    map.put(i, j);
                } else if (sum > k) {
                    break;
                }
            }
            sum = 0;
        }

        int[] answer = new int[2];
        int min = Integer.MAX_VALUE;
        int target = -1;
        for (int i=0; i<sequence.length; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) - i < min) {
                    min = map.get(i) - i;
                    target = i;
                }
            }
        }

        answer[0] = target;
        answer[1] = map.get(target);

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}
