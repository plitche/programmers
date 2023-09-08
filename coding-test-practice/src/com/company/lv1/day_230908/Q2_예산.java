package com.company.lv1.day_230908;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/12982
public class Q2_예산 {

//    private static int[] d = {1,3,2,5,4};
//    private static int budget = 9;

    private static int[] d = {2,2,3,3};
    private static int budget = 10;

    public static void main(String[] args) {
        int answer = 0;

        Arrays.sort(d);
        int sum = 0;
        for (int i=0; i<d.length; i++) {
            sum += d[i];
            if (budget < sum) {
                break;
            }
            answer+=1;
        }

        System.out.println("answer = " + answer);
    }

}
