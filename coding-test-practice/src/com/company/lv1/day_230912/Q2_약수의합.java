package com.company.lv1.day_230912;

// https://school.programmers.co.kr/learn/courses/30/lessons/12928
public class Q2_약수의합 {

    private static int n = 1;

    public static void main(String[] args) {
        int answer = 0;

        int max = n+1;
        for (int i=1; i<max; i++) {
            if (n%i == 0) {
                int divide = n/i;
                answer += i == divide ? i : i + divide;
                max = divide;
            }
        }

        System.out.println(answer);
    }
}
