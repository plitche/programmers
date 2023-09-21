package com.company.lv2.day_230921;

import java.util.ArrayList;
import java.util.Collections;

// https://school.programmers.co.kr/learn/courses/30/lessons/154539
public class Q2_뒤에있는큰수찾기_time {

    //private static int[] numbers = {2, 3, 3, 5};
    private static int[] numbers = {9, 1, 5, 3, 6, 2};

    public static void main(String[] args) {
        int[] answer = new int[numbers.length];

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> maxList = new ArrayList<>();
        for (int i=0; i<numbers.length; i++) {
            int number = numbers[i];
            list.add(number);
            maxList.add(number);
        }

        Collections.sort(maxList, Collections.reverseOrder());

        for (int i=0; i<numbers.length; i++) {
            int number = numbers[i];

            if (maxList.get(0) == number) {
                answer[i] = -1;
                maxList.remove(0);
            } else {
                for (int j=i+1; j<list.size(); j++) {
                    if (list.get(j) > number) {
                        answer[i] = list.get(j);
                        break;
                    }
                }

                if(answer[i] == 0) answer[i] = -1;
            }
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }

}
