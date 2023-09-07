package com.company.lv1.day_230907;

import java.util.HashMap;

// https://school.programmers.co.kr/learn/courses/30/lessons/42576
public class Q1_완주하지못한선수_answer {

    private static String[] participant = {"leo", "kiki", "eden", "kiki"};
    private static String[] completion = {"eden", "kiki", "leo"};

    public static void main(String[] args) {
        String answer = "";

        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }

        System.out.println("answer = " + answer);
    }

}
