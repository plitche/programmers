package com.company.lv2.day_231008;

// https://school.programmers.co.kr/learn/courses/30/lessons/12980
public class Q1_점프와순간이동_wrong {

//    private static int N = 5;
    private static int N = 6;
//    private static int N = 5000;

    public static void main(String[] args) {
        int answer = 1;

        int position = 1;
        while(position < N) {
            position *= 2;
        }
        if (position > N) {
            position /= 2;
        }

        answer += N - position;
        System.out.println("answer = " + answer);
    }

}
