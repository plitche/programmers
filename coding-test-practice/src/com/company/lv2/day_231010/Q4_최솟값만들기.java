package com.company.lv2.day_231010;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/12953
public class Q4_최솟값만들기 {

//    private static int[] A = {1, 4, 2};
//    private static int[] B = {5, 4, 4};

    private static int[] A = {1, 2};
    private static int[] B = {3, 4};

    public static void main(String[] args) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        int length = A.length;
        for (int i=0; i<length; i++) {
            answer += A[i] * B[length-(i+1)];
        }

        System.out.println("answer = " + answer);
    }

}
