package com.company.lv2.day_231013;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

// https://school.programmers.co.kr/learn/courses/30/lessons/42584
public class Q3_주식가격 {

    //private static int[] prices = {1, 2, 3, 2, 3};
    //private static int[] prices = {2, 2, 3, 1, 5};
    private static int[] prices = {3, 1, 3, 1, 3};

    public static void main(String[] args) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            int sec = 0;
            int target = prices[i];

            boolean isStop = false;
            for (int j = i+1; j < prices.length; j++) {
                if (isStop) break;

                if (target <= prices[j]) sec++;
                else isStop = true;
            }

            if (isStop) sec++;
            answer[i] = (i != prices.length-1 && sec == 0) ? 1 : sec;
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }

}
