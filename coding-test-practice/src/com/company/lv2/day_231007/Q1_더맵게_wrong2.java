package com.company.lv2.day_231007;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/42626
public class Q1_더맵게_wrong2 {

//    private static int[] scoville = {1, 2, 3, 9, 10, 12};
//    private static int K = 7;

    private static int[] scoville = {1, 2, 3};
    private static int K = 11;

//    private static int[] scoville = {1, 2};
//    private static int K = 1;

    public static void main(String[] args) {
        int answer = 0;
        int[] arr = new int[1000000000];

        for (int i : scoville) arr[i] += 1;

        int a = -1;
        int b = -1;
        while(true) {
            for (int i=0; i<arr.length; i++) {
                if (arr[i] > 0) {
                    a = i;
                    arr[i] -= 1;
                    break;
                }
            }

            if (a >= K) break;

            for (int i=0; i<arr.length; i++) {
                if (arr[i] > 0) {
                    b = i;
                    arr[i] -= 1;
                    break;
                }
            }

            answer += 1;
            if (K <= a + b*2) {
                break;
            } else {
                arr[a + b*2] += 1;
            }
        }

        System.out.println("answer = " + answer);
    }

}
