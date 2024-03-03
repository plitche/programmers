package com.company.lv0.day_240303;

// https://school.programmers.co.kr/learn/courses/30/lessons/181929
public class Q3_원소들의곱과합 {

    private static int[] num_list = {3, 4, 5, 2, 1};
//    private static int[] num_list = {5, 7, 8, 3};

    public static void main(String[] args) {
        int sum = 0;
        int multiple = 1;

        for (int i : num_list) {
            sum += i;
            multiple *= i;
        }

        System.out.println("answer = " + (Math.pow(sum, 2) > multiple ? 1 : 0));
    }
}
