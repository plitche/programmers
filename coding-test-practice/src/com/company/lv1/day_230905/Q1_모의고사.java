package com.company.lv1.day_230905;

// https://school.programmers.co.kr/learn/courses/30/lessons/42840
public class Q1_모의고사 {

    //private static int[] answers = {1, 2, 3, 4, 5};
    private static int[] answers = {1, 3, 2, 4, 2};

    public static void main(String[] args) {
        int[] answer = {};

        int[] a = {1, 2, 3, 4, 5}; // 5
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5}; // 8
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // 10

        int aCount = 0;
        int bCount = 0;
        int cCount = 0;

        for (int i=0; i<answers.length; i++) {
            int num = answers[i];

            if (a[i%5] == num) aCount += 1;
            if (b[i%8] == num) bCount += 1;
            if (c[i%10] == num) cCount += 1;
        }

        if (aCount == bCount && aCount == cCount) answer = new int[]{1, 2, 3};
        else if (aCount == bCount && aCount > cCount) answer = new int[]{1, 2};
        else if (aCount == cCount && aCount > bCount) answer = new int[]{1, 3};
        else if (bCount == cCount && bCount > aCount) answer = new int[]{2, 3};
        else {
            if (aCount > bCount) {
                if (aCount > cCount) {
                    answer = new int[]{1};
                } else {
                    answer = new int[]{3};
                }
            } else {
                if (bCount > cCount) {
                    answer = new int[]{2};
                } else {
                    answer = new int[]{3};
                }
            }
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }

}
