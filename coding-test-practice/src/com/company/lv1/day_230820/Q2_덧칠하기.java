package com.company.lv1.day_230820;

import java.util.ArrayList;

// https://school.programmers.co.kr/learn/courses/30/lessons/161989
public class Q2_덧칠하기 {

    //private static int n = 8;
    //private static int m = 4;
    //private static int[] section = {2, 3, 6};

    private static int n = 4;
    private static int m = 2;
    private static int[] section = {3, 4};

    public static void main(String[] args) {
        int answer = 0;

        if (m == 1) {
            answer = section.length;
        } else if (n == m) {
            answer = 1;
        } else {
            int[] arr = new int[n];

            for (int i=0; i<section.length; i++) {
                arr[section[i]-1] = 1;
            }

            for (int i=0; i<arr.length; i++) {
                if (arr[i] == 1) {
                    answer++;

                    for (int j=i; j<i+m; j++) {
                        if (j > n-1) {
                            break;
                        }
                        arr[j] = 0;
                    }
                }
            }
        }

        System.out.println("answer = " + answer);
    }
}
