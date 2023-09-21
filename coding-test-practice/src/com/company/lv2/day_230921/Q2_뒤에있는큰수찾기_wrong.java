package com.company.lv2.day_230921;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

// https://school.programmers.co.kr/learn/courses/30/lessons/154539
public class Q2_뒤에있는큰수찾기_wrong {

    private static int[] numbers = {2, 3, 3, 5};
    //private static int[] numbers = {9, 1, 5, 3, 6, 2};

    public static void main(String[] args) {
        int[] answer = new int[numbers.length];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<numbers.length; i++) {
            map.put(numbers[i], i);
        }

        for (int i=0; i<numbers.length; i++) {
            int number = numbers[i];

            int max = -1;
            for (Integer num : map.keySet()) {
                if (num > number && map.get(num) > i) {
                    max = num;
                }
            }

            answer[i] = max;
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }

}
