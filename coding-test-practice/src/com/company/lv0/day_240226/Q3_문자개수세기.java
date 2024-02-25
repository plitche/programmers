package com.company.lv0.day_240226;

// https://school.programmers.co.kr/learn/courses/30/lessons/181902
public class Q3_문자개수세기 {

    private static String my_string = "Programmers";

    public static void main(String[] args) {
        int[] answer = new int[52];

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (c >= 'a') {
                answer[c-'a'+26] += 1;
            } else {
                answer[c-'A'] += 1;
            }
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}
