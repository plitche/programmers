package com.company.lv2;

import java.util.*;

// https://school.programmers.co.kr/learn/courses/30/lessons/178870
public class Q3_연속된부분수열의합_wrong {

    private static int[] sequence = {1, 2, 3, 4, 5};
    private static int k = 7;

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<sequence.length; i++) {
            map.put(sequence[i], map.getOrDefault(sequence[i], 0)+1);
        }

        int sum = 0;
        for (int i=k; i>=0; i--) {
            if (sum < k && map.getOrDefault(i, 0) > 0) {
                sum += i;
                map.put(i, map.get(i)-1);
                i--;

                for (int j=sequence.length-1; j>=0; j--) {
                    if (sequence[j] == i) {
                        System.out.println("i = " + i);
                        System.out.println("j = " + j);
                        System.out.println(sequence[j]);
                        sequence[j] = -1;
                        list.add(j);
                    }
                }
            }
        }

        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}
