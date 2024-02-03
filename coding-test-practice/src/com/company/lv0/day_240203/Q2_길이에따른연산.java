package com.company.lv0.day_240203;

// https://school.programmers.co.kr/learn/courses/30/lessons/181879
public class Q2_길이에따른연산 {

    private static int[] num_list = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
    // private static int[] num_list = {2, 3, 4, 5};

    public static void main(String[] args) {
        int answer = 0;
        int length = num_list.length;

        if (length > 10) {
            for (int i : num_list) answer += i;
        } else {
            answer = 1;
            for (int i : num_list) answer *= i;
        }

        System.out.println("answer = " + answer);
    }
}
