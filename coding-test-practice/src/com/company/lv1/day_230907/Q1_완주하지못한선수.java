package com.company.lv1.day_230907;

import java.util.HashMap;

// https://school.programmers.co.kr/learn/courses/30/lessons/42576
public class Q1_완주하지못한선수 {

    private static String[] participant = {"leo", "kiki", "eden", "kiki"};
    private static String[] completion = {"eden", "kiki", "leo"};

    public static void main(String[] args) {
        String answer = "";

        HashMap<String, Integer> participantMap = new HashMap<>();
        HashMap<String, Integer> completionMap = new HashMap<>();
        for (String s : participant) participantMap.put(s, participantMap.getOrDefault(s, 0)+1);
        for (String s : completion) completionMap.put(s, completionMap.getOrDefault(s, 0)+1);

        for (String s : participantMap.keySet()) {
            if (participantMap.getOrDefault(s, 0) > completionMap.getOrDefault(s, 0)) {
                answer = s;
                break;
            }
        }

        System.out.println("answer = " + answer);
    }

}
