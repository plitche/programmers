package com.company.lv1.day_230831;

import java.util.HashMap;

// https://school.programmers.co.kr/learn/courses/30/lessons/118666
public class Q1_성격유형검사하기 {

    //private static String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
    //private static int[] choices = {5, 3, 2, 7, 5};

    private static String[] survey = {"TR", "RT", "TR"};
    private static int[] choices = {7, 1, 3};

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0; i<survey.length; i++) {
            int score = choices[i];
            Character c = '0';
            if (score == 4) continue;

            if (score > 4) {
                c = survey[i].charAt(1);
                score = score - 4;
            } else {
                c = survey[i].charAt(0);
                score = 4 - score;
            }

            map.put(c, map.getOrDefault(c, 0) + score);
        }

        sb.append(map.getOrDefault('R', 0) >= map.getOrDefault('T', 0) ? 'R' : 'T');
        sb.append(map.getOrDefault('C', 0) >= map.getOrDefault('F', 0) ? 'C' : 'F');
        sb.append(map.getOrDefault('J', 0) >= map.getOrDefault('M', 0) ? 'J' : 'M');
        sb.append(map.getOrDefault('A', 0) >= map.getOrDefault('N', 0) ? 'A' : 'N');

        System.out.println("answer = " + sb.toString());
    }
}
