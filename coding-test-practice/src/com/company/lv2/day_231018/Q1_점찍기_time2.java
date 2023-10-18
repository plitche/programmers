package com.company.lv2.day_231018;

// https://school.programmers.co.kr/learn/courses/30/lessons/140107
public class Q1_점찍기_time2 {

//    private static int k = 2;
//    private static int d = 4;

//    private static int k = 1;
//    private static int d = 5;

    private static int k = 1;
    private static int d = 1;

    public static void main(String[] args) {
        long answer = 1;

        answer += (d/k)*2;

        long max = k;
        int idx = 1;
        while(true) {
            if (d > max*idx) idx++;
            else {
                max = max*(idx-1);
                break;
            }
        }
        int y = k;
        for (long i = max; i >= k; i-=k) {
            if (Math.sqrt((i*i)+(y*y)) <= d) {
                answer += i/k;
                i += k;
                y += k;
            }
        }

        System.out.println("answer = " + answer);
    }

}
