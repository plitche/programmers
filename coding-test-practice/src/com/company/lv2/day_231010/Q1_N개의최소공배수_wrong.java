package com.company.lv2.day_231010;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/12953
public class Q1_N개의최소공배수_wrong {

    //private static int[] arr = {2,6,8,14};
    //private static int[] arr = {1, 2, 3};
//    private static int[] arr = {12, 32, 45, 67, 72}; //96480
    private static int[] arr = {1,10,100,1000,5000,3,9999}; //26

// 1000: 1, 10, 100, 1, 5, 30, 9999
// 10: 1, 1, 10, 1, 5, 3, 9999

    public static void main(String[] args) {
        int answer = 1;

        Arrays.sort(arr);
        for (int i=arr[arr.length-1]; i>=2; i--) {
            int count = 0;
            for (int j=0; j<arr.length; j++) {
                if (arr[j] % i == 0) {
                    count += 1;
                }

                if (count >= 2) {
                    break;
                }
            }

            if (count >= 2) {
                for (int j=0; j<arr.length; j++) {
                    if (arr[j] % i == 0) {
                        arr[j] = arr[j]/i;
                    }
                }
                answer *= i;
                System.out.println("answer = " + answer);
            }
        }

        for (int i : arr) {
            answer *= i;
        }
        System.out.println("answer = " + answer);
    }

}
