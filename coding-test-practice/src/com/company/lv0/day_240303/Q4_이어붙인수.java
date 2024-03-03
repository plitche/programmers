package com.company.lv0.day_240303;

// https://school.programmers.co.kr/learn/courses/30/lessons/181928
public class Q4_이어붙인수 {

    private static int[] num_list = {3, 4, 5, 2, 1};
//    private static int[] num_list = {5, 7, 8, 3};

    public static void main(String[] args) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();

        for (int i : num_list) {
            if (i%2 == 1) odd.append(i);
            else even.append(i);
        }

        System.out.println("answer = " + Integer.parseInt(odd.toString()) + Integer.parseInt(even.toString()));
    }
}
