package com.company.lv2.day_231010;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/12939
public class Q5_최댓값과최솟값 {

    //private static String s = "1 2 3 4";
//    private static String s = "1 -1 -4 4";
//    private static String s = "-1 -2 -3 -4";
    private static String s = "-12 -10 5";

    public static void main(String[] args) {
        String[] split = s.split(" ");
        int[] arr = new int[split.length];
        for (int i=0; i<split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(arr);
        System.out.println("answer = " + arr[0] + " " + arr[arr.length-1]);
    }

}
