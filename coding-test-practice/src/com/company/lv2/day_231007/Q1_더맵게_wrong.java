package com.company.lv2.day_231007;

import java.util.ArrayList;
import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/42626
public class Q1_더맵게_wrong {

//    private static int[] scoville = {1, 2, 3, 9, 10, 12};
//    private static int k = 7;

//    private static int[] scoville = {1, 2, 3};
//    private static int K = 11;

    private static int[] scoville = {1, 2};
    private static int K = 1;

    public static void main(String[] args) {
        int answer = 0;
        int before = scoville[0];

        Arrays.sort(scoville);


        if (before < K) {
            for (int i=1; i<scoville.length; i++) {
                int next = scoville[i];

                if (before < next) {
                    before = before + next*2;
                } else {
                    before = before*2 + next;
                }

                answer += 1;
                if (before >= K) {
                    break;
                }

                if (i == scoville.length-1) {
                    answer = -1;
                }
            }
        }

        System.out.println("answer = " + answer);
    }

}
