package com.company.lv1.day_230907;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// https://school.programmers.co.kr/learn/courses/30/lessons/42576
public class Q1_완주하지못한선수_time {

    private static String[] participant = {"leo", "kiki", "eden", "eden"};
    private static String[] completion = {"eden", "kiki", "leo"};

    public static void main(String[] args) {
        String answer = "";

        int lengthA = participant.length;
        List<String> collect = Arrays.stream(completion).collect(Collectors.toList());

        for (int i=0; i<lengthA; i++) {
            String runner = participant[i];
            if (!collect.contains(runner)) {
                answer = runner;
                break;
            } else {
                collect.remove(runner);
            }
        }

        System.out.println("answer = " + answer);
    }

}
