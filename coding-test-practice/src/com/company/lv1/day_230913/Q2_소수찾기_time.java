package com.company.lv1.day_230913;

// https://school.programmers.co.kr/learn/courses/30/lessons/12921
public class Q2_소수찾기_time {

    private static int n = 10;

    public static void main(String[] args) {
        int answer = 0;

        int count = 0;
        for (int i=1; i<=n; i++) {
            int max = i;
            for (int j=1; j<max; j++) {
                if (i%j == 0) {
                    if (j == i/j) {
                        count++;
                    } else {
                        count+=2;
                    }

                    max = i/j;
                }
            }
            if (count == 2) {
                answer += 1;
            }
            count = 0;
        }

        System.out.println("answer = " + answer);
    }
}
