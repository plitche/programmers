package com.company.lv0.day_240224;

// https://school.programmers.co.kr/learn/courses/30/lessons/181913
public class Q4_문자열여러번뒤집기_answer {

    private static String my_string	 = "rermgorpsam";
    private static int[][] queries	 = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};

    private static char[] arr;

    public static void main(String[] args) {
        arr = my_string.toCharArray();

        for (int[] query : queries) {
            reverse(query[0], query[1]);
        }

        System.out.println("answer = " + new String(arr));
    }

    private static void reverse(int s, int e) {
        while (s < e) {
            char temp = arr[s];
            arr[s++] = arr[e];
            arr[e--] = temp;
        }
    }
}
