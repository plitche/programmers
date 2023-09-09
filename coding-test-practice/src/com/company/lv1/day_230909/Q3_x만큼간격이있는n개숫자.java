package com.company.lv1.day_230909;

// https://school.programmers.co.kr/learn/courses/30/lessons/12954
public class Q3_x만큼간격이있는n개숫자 {
//    private static int x = 2;
//    private static int n = 5;

//    private static int x = -4;
//    private static int n = 3;

    private static int x = 10000000;
    private static int n = 1000;

    public static void main(String[] args) {
        long[] answer = new long[n];

        int idx = 0;
        if (x > 0) {
            for (long i=x; i<(long)x*n; i+=x) {
                answer[idx] = i;
                idx+=1;
            }
        } else {
            for (long i=x; i>(long)x*n; i+=x) {
                answer[idx] = i;
                idx+=1;
            }
        }

        answer[n-1] = (long)x*n;

        for (long l : answer) {
            System.out.print(l + " ");
        }

    }
}