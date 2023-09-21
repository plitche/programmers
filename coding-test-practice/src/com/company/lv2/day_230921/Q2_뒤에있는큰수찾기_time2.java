package com.company.lv2.day_230921;

import java.util.HashMap;

// https://school.programmers.co.kr/learn/courses/30/lessons/154539
public class Q2_뒤에있는큰수찾기_time2 {

    private static int[] numbers = {2, 3, 3, 5};
    //private static int[] numbers = {9, 1, 5, 3, 6, 2};

    public static void main(String[] args) {
        int length = numbers.length;
        int[] answer = new int[numbers.length];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<length; i++) {
            map.put(i, numbers[i]);
        }

        for (int i=0; i<length; i++) {
            int number = numbers[i];

            for (int j=i+1; j<length; j++) {
                Integer num = map.get(j);
                if (num > number) {
                    answer[i] = num;
                    break;
                }
            }

            if (answer[i] == 0) answer[i] = - 1;
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }

}
