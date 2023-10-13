package com.company.lv2.day_231013;

// https://school.programmers.co.kr/learn/courses/30/lessons/42584
public class Q3_주식가격_answer {

    //private static int[] prices = {1, 2, 3, 2, 3};
    //private static int[] prices = {2, 2, 3, 1, 5};
    private static int[] prices = {3, 1, 3, 1, 3};

    public static void main(String[] args) {
        int len = prices.length;
        int[] answer = new int[len];
        int i, j;
        for (i = 0; i < len; i++) {
            for (j = i + 1; j < len; j++) {
                answer[i]++;
                if (prices[i] > prices[j])
                    break;
            }
        }

        for (int sec : answer) {
            System.out.print(sec + " ");
        }
    }

}
