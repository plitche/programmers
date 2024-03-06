package com.company.lv0.day_240306;

// https://school.programmers.co.kr/learn/courses/30/lessons/181922
public class Q1_수열과구간쿼리4 {

    private static int[] arr = {0, 1, 2, 4, 3};
    private static int[][] queries = {{0, 4, 1},{0, 3, 2},{0, 3, 3}};

    public static void main(String[] args) {

        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];

            for (int j = 0; j < arr.length; j++) {
                if (s <= j && j <= e && j % k == 0) {
                    arr[j] += 1;
                }
            }
        }

        for (int i : arr) {
            System.out.println("i = " + i);
        }
    }
}
