package com.company.lv0.day_240218;

// https://school.programmers.co.kr/learn/courses/30/lessons/181898
public class Q3_리스트자르기 {

    private static int n = 3;
    private static int[] slicer = {1, 5, 2};
    private static int[] num_list	 = {1, 2, 3, 4, 5, 6, 7, 8, 9};


    public static void main(String[] args) {
        int answer = -1;

        for (int i = idx; i < arr.length; i++) {
            if (i >= idx && arr[i] == 1) {
                answer = i;
                break;
            }
        }

        System.out.println("answer = " + answer);
    }
}
