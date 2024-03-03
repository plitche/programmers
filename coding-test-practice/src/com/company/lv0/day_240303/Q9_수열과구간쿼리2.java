package com.company.lv0.day_240303;

// https://school.programmers.co.kr/learn/courses/30/lessons/181923
public class Q9_수열과구간쿼리2 {

    private static int[] arr = {0, 1, 2, 4, 3};
    private static int[][] queries = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};

    public static void main(String[] args) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int min = Integer.MAX_VALUE;

            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            for (int j = s; j <= e; j++) {
                if (k < arr[j] && arr[j] < min) min = arr[j];
            }

            answer[i] = min != Integer.MAX_VALUE ? min : -1;
        }

        for (int i : answer) {
            System.out.println("i = " + i);
        }
    }
}
