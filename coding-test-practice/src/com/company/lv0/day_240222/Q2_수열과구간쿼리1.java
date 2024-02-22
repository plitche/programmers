package com.company.lv0.day_240222;

// https://school.programmers.co.kr/learn/courses/30/lessons/181883
public class Q2_수열과구간쿼리1 {

    private static int[] arr = {0, 1, 2, 3, 4};
    private static int[][] queries = {{0, 1},{1, 2},{2, 3}};

    public static void main(String[] args) {
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];

            for (int i = start; i <= end; i++) {
                arr[i] += 1;
            }
        }

        for (int i : arr) {
            System.out.println("i = " + i);
        }
    }
}
