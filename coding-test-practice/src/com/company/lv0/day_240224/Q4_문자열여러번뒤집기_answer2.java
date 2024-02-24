package com.company.lv0.day_240224;

// https://school.programmers.co.kr/learn/courses/30/lessons/181913
public class Q4_문자열여러번뒤집기_answer2 {

    private static String my_string	 = "rermgorpsam";
    private static int[][] queries	 = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};

    public static void main(String[] args) {
        for (int[] arr : queries) {
            String start = my_string.substring(0, arr[0]);
            String reverse = new StringBuilder(my_string.substring(arr[0], arr[1] + 1)).reverse().toString();
            String end = my_string.substring(arr[1] + 1);

            my_string = start + reverse + end;
        }

        System.out.println("my_string = " + my_string);
    }
}
