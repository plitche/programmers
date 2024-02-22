package com.company.lv0.day_240222;

// https://school.programmers.co.kr/learn/courses/30/lessons/181884
public class Q1_n보다커질때까지더하기_answer {

    private static int[] numbers = {34, 5, 71, 29, 100, 34};
    private static int n = 123;

//    private static int[] num_list = {58, 44, 27, 10, 100};
//    private static int n = 139;

    public static void main(String[] args) {
        int answer = 0;

        for(int i = 0; answer <= n; i++) {
            answer += numbers[i];
        }

        System.out.println("answer = " + answer);
    }
}
