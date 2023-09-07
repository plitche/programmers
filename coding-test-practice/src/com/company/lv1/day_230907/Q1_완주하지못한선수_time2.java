package com.company.lv1.day_230907;

// https://school.programmers.co.kr/learn/courses/30/lessons/42576
public class Q1_완주하지못한선수_time2 {

    private static String[] participant = {"leo", "kiki", "eden", "kiki"};
    private static String[] completion = {"eden", "kiki", "leo"};

    public static void main(String[] args) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        int lengthA = participant.length;
        for (String s : completion) {
            sb.append(s);
        }

        String temp = sb.toString();

        for (int i=0; i<lengthA; i++) {
            String runner = participant[i];
            if (!temp.contains(runner)) {
                answer = runner;
                break;
            } else {
                temp = temp.replaceFirst(runner, "");
            }
        }

        System.out.println("answer = " + answer);
    }

}
