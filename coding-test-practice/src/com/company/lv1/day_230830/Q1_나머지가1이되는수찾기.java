package com.company.lv1.day_230830;

// https://school.programmers.co.kr/learn/courses/30/lessons/87389
public class Q1_나머지가1이되는수찾기 {

    private static int n = 10;

    public static void main(String[] args) {
        int answer = 0;

        if (n%2 == 1) {
            answer = 2;
        } else {
            for (int i=3; i<n; i++) {
                if (n%i == 1) {
                    answer = i;
                    break;
                }
            }
        }

        System.out.println("answer = " + answer);
    }

}
