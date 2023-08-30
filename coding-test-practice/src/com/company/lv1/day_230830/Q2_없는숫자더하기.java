package com.company.lv1.day_230830;

// https://school.programmers.co.kr/learn/courses/30/lessons/86051
public class Q2_없는숫자더하기 {

    private static int[] numbers = {1,2,3,4,6,7,8,0};

    public static void main(String[] args) {
        int answer = 0;

        int[] arr = new int[10];

        for (int i=0; i<numbers.length; i++) {
            arr[numbers[i]] += 1;
        }

        for (int i=0; i<10; i++) {
            if (arr[i] == 0) {
                answer += i;
            }
        }

        System.out.println("answer = " + answer);
    }

}
