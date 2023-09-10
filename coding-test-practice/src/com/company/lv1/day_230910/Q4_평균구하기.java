package com.company.lv1.day_230910;

// https://school.programmers.co.kr/learn/courses/30/lessons/12944
public class Q4_평균구하기 {

    private static int[] arr = {1, 2, 3, 4};
    public static void main(String[] args) {
        double answer = 0;
        for (int i=0; i<arr.length; i++) {
            answer += arr[i];
        }
        System.out.println("answer = " + answer/arr.length);
    }

}
