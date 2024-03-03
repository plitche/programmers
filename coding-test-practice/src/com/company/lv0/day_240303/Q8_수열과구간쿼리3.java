package com.company.lv0.day_240303;

// https://school.programmers.co.kr/learn/courses/30/lessons/181924
public class Q8_수열과구간쿼리3 {

    private static int[] arr = {0, 1, 2, 3, 4};
    private static int[][] queries = {{0, 3},{1, 2},{1, 4}};

    public static void main(String[] args) {
        for (int[] query : queries) {
            int a = arr[query[0]];
            arr[query[0]] = arr[query[1]];
            arr[query[1]] = a;
        }

        for (int i : arr) {
            System.out.println("i = " + i);
        }
    }
}
