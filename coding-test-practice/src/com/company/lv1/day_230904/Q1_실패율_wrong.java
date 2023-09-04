package com.company.lv1.day_230904;

import java.util.Arrays;
import java.util.HashMap;

// https://school.programmers.co.kr/learn/courses/30/lessons/42889
public class Q1_실패율_wrong {

//    private static int N = 5;
//    private static int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

    private static int N = 4;
    private static int[] stages = {4, 4, 4, 4, 4};

    public static void main(String[] args) {
        int[] answer = new int[N];

        int length = stages.length;
        int[] pass = new int[length];
        int[] total = new int[length];

        for (int i=0; i<stages.length; i++) {
            int stage = stages[i] - 1;

            for (int j=0; j<stage; j++) {
                pass[j] += 1;
            }

            for (int j=0; j<=stage; j++) {
                total[j] += 1;
            }
        }

        HashMap<Double, Integer> map = new HashMap<>();
        double[] rate = new double[N];
        for (int i=0; i<N; i++) {
            double temp = (double)pass[i]/total[i];

            if (map.containsKey(temp)) {
                temp *= (1 + i*0.0001);
            }

            rate[i] = temp;
            map.put(temp, i+1);
        }

        Arrays.sort(rate);
        for (int i=0; i<N; i++) {
            answer[i] = map.get(rate[i]);
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}
