package com.company.lv2.day_231018;

// https://school.programmers.co.kr/learn/courses/30/lessons/140107
public class Q1_점찍기 {

//    private static int k = 2;
//    private static int d = 4;

//    private static int k = 1;
//    private static int d = 5;

    private static int k = 2;
    private static int d = 5;

    public static void main(String[] args) {
        long answer = 0;
        long length = (long)d*d;
        for (long i = 0; i <= d; i+=k) {
            int y = (int)Math.sqrt(length - (i*i));
            answer += y/k +1;
        }

        System.out.println("answer = " + answer);
    }

}
