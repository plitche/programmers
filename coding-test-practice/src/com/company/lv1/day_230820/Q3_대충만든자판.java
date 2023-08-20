package com.company.lv1.day_230820;

import java.util.HashMap;

// https://school.programmers.co.kr/learn/courses/30/lessons/160586
public class Q3_대충만든자판 {

    //private static String[] keymap = {"ABACD", "BCEFD"};
    //private static String[] targets = {"ABCD", "AABB"};

    //private static String[] keymap = {"AA"};
    //private static String[] targets = {"B"};

    private static String[] keymap = {"ABCE"};
    private static String[] targets = {"ABDE"};

    public static void main(String[] args) {
        int[] answer = new int[targets.length];

        HashMap<Character, Integer> map = new HashMap<>();

        for (String s : keymap) {
            char[] split = s.toCharArray();

            for (int i=0; i<split.length; i++) {
                if (!map.containsKey(split[i]) || map.get(split[i]) > i) {
                    map.put(split[i], i+1);
                }
            }
        }

        for (int i=0; i<targets.length; i++) {
            int sum = 0;
            char[] split = targets[i].toCharArray();

            for (char s : split) {
                if (!map.containsKey(s)) {
                    answer[i] = -1;
                    sum = 0;
                    break;
                } else {
                    sum += map.get(s);
                }
            }

            if (sum != 0) {
                answer[i] = sum;
            }
        }

        for (int i : answer) {
            System.out.println("answer = " + i);
        }
    }
}
