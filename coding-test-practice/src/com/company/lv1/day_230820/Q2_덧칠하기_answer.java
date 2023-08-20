package com.company.lv1.day_230820;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/161989
public class Q2_덧칠하기_answer {

    //private static int n = 8;
    //private static int m = 4;
    //private static int[] section = {2, 3, 6};

    private static int n = 10;
    private static int m = 2;
    private static int[] section = {1, 3, 5, 7, 9};

    public static void main(String[] args) {
        int answer = 0;
        int current = 1;

        for(int i = 0; i < section.length; i++) {
            if(current <= section[i]) {
                current = section[i] + m;
                answer++;
            }
        }

        System.out.println("answer = " + answer);
    }
}
