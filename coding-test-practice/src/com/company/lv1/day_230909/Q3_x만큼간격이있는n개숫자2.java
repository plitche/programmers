package com.company.lv1.day_230909;

// https://school.programmers.co.kr/learn/courses/30/lessons/12954
public class Q3_x만큼간격이있는n개숫자2 {
//    private static int x = 2;
//    private static int n = 5;

    private static int x = -4;
    private static int n = 3;

//    private static int x = 10000000;
//    private static int n = 1000;

    public static void main(String[] args) {
        long[] answer = new long[n];
        for (int i=1; i<=n; i++) answer[i-1] = (long)x*i;

        for (long l : answer) {
            System.out.print(l + " ");
        }

    }
}