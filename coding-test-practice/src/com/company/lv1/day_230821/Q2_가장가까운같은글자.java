package com.company.lv1.day_230821;

import java.util.HashMap;

// https://school.programmers.co.kr/learn/courses/30/lessons/142086
public class Q2_가장가까운같은글자 {

    //private static String s = "banana";
    private static String s = "foobar";

    public static void main(String[] args) {
        int[] answer = new int[s.length()];

        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i=0; i<chars.length; i++) {
            char temp = chars[i];

            if (!map.containsKey(temp)) {
                answer[i] = -1;
            } else {
                answer[i] = i - map.get(temp);
            }

            map.put(temp, i);
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}
