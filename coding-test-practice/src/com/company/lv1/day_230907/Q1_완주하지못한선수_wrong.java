package com.company.lv1.day_230907;

import java.util.HashMap;

// https://school.programmers.co.kr/learn/courses/30/lessons/42576
public class Q1_완주하지못한선수_wrong {

    private static String[] participant = {"leo", "kiki", "eden", "kiki"};
    private static String[] completion = {"eden", "kiki", "leo"};

    public static void main(String[] args) {
        String answer = "";

        int lengthA = participant.length;
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : completion) {
            map.put(s, 1);
        }

        for (int i=0; i<lengthA; i++) {
            String runner = participant[i];
            if (map.getOrDefault(runner, 0) == 0) {
                answer = runner;
                break;
            } else {
                map.put(runner, 0);
            }
        }

        System.out.println("answer = " + answer);
    }

}
