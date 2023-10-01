package com.company.lv2.day_231001;

import java.util.ArrayList;

// https://school.programmers.co.kr/learn/courses/30/lessons/43165
public class Q1_타겟넘버 {

//    private static int[] numbers = {1, 1, 1, 1, 1};
//    private static int target = 3;

    private static int[] numbers = {4, 1, 2, 1};
    private static int target = 4;
    static int count = 0;
    public static void main(String[] args) {
        check(0, 0, numbers);
        System.out.println("count = " + count);
    }

    public static void check(int index, int sum, int[] arr) {
        if (index == arr.length) {
            if (sum == target) {
                count+=1;
            }
            return;
        }

        check(index+1, sum + arr[index], arr);
        check(index+1, sum - arr[index], arr);
    }

}
