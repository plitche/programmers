package com.company.lv2.day_231010;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/12953
public class Q1_N개의최소공배수 {

    //private static int[] arr = {2,6,8,14};
    //private static int[] arr = {1, 2, 3};
//    private static int[] arr = {12, 32, 45, 67, 72}; //96480
    private static int[] arr = {1,10,100,1000,5000,3,9999}; //26

    public static void main(String[] args) {
        int answer = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int currentNumber = arr[i];
            answer = (answer * currentNumber) / gcd(answer, currentNumber);
        }

        System.out.println("answer = " + answer);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

}
