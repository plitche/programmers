package com.company.lv0.day_240226;

// https://school.programmers.co.kr/learn/courses/30/lessons/181901
public class Q4_배열만들기1 {

    private static int n = 10;
    private static int k = 3;

    public static void main(String[] args) {
        int[] answer = new int[n/k];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = (i+1)*k;
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}
