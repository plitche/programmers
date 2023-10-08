package com.company.lv2.day_231008;

// https://school.programmers.co.kr/learn/courses/30/lessons/12980
public class Q1_점프와순간이동 {

//    private static int N = 5;
//    private static int N = 6;
    private static int N = 5000;

    public static void main(String[] args) {
        int answer = 0;

        int position = N;
        while(true) {
            if (position == 1) {
                answer += 1;
                break;
            }

            if (position%2 == 1) answer += 1;
            position /= 2;
        }

        System.out.println("answer = " + answer);
    }

}
