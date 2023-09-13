package com.company.lv1.day_230913;

// https://school.programmers.co.kr/learn/courses/30/lessons/12921
public class Q2_소수찾기 {

    private static int n = 10;

    public static void main(String[] args) {
        int answer = 0;

        for (int i=1; i<=n; i++) {
            if (i == 1) {
                answer = 0;
            } else if (i == 2) {
                answer += 1;
            } else if (i == 3) {
                answer += 1;
            } else {
                int count = 0;
                for (int j=2; j<=Math.sqrt(i); j++) {
                    if (i%j == 0) {
                        count += 1;
                        break;
                    }
                }

                if (count > 0) {
                    continue;
                } else {
                    answer += 1;
                }
            }
        }

        System.out.println("answer = " + answer);
    }
}
