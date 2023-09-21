package com.company.lv2.day_230921;

import java.util.ArrayList;
import java.util.Collections;

// https://school.programmers.co.kr/learn/courses/30/lessons/154539
public class Q2_뒤에있는큰수찾기_wrong2 {

    //private static int[] numbers = {2, 3, 3, 5};
    private static int[] numbers = {9, 1, 5, 3, 6, 2};

    public static void main(String[] args) {
        int length = numbers.length;
        int[] answer = new int[numbers.length];

        ArrayList<Integer> maxList = new ArrayList<>();
        for (int i=0; i<numbers.length; i++) {
            maxList.add(numbers[i]);
        }
        Collections.sort(maxList, Collections.reverseOrder());

        int number = numbers[0];
        int idx = 1;
        for (int i=1; i<length; i++) {
            int temp = numbers[i];

            if (number < temp) {
                answer[idx-1] = temp;
                number = numbers[idx];
                i = idx;
                idx++;
                continue;
            }

            if (maxList.get(0) == number) {
                answer[idx-1] = -1;
                maxList.remove(0);
                number = numbers[idx];
                i = idx;
                idx++;
            }
        }

        answer[length-1] = -1;
        for (int i : answer) {
            System.out.print(i + " ");
        }
    }

}
