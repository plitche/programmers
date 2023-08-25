package com.company.lv1.day_230826;

import java.util.ArrayList;

// https://school.programmers.co.kr/learn/courses/30/lessons/133502
public class Q1_햄버거만들기_time3 {

    //private static int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
    private static int[] ingredient = {1, 1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1};

    public static void main(String[] args) {
        int answer = 0;

        ArrayList<Integer> list = new ArrayList<>();
        int length = ingredient.length;
        for (int i=0; i<length; i++) {
            int temp = ingredient[i];

            if ((i == 0 && temp != 1) || i == length-1 && temp != 1) {
                continue;
            }
            list.add(ingredient[i]);
        }

        int size = list.size();
        if (size > 100000) {
            while(list.get(size-1) != 1) {
                list.remove(size-1);
            }
        }

        for (int i=0; i<=size-4; i++) {
            if (list.get(i) == 1) {
                if (list.get(i+1) == 2) {
                    if (list.get(i+2) == 3) {
                        if (list.get(i+3) == 1) {
                            answer += 1;
                            list.remove(i+3);
                            list.remove(i + 2);
                            list.remove(i + 1);
                            list.remove(i);
                            i = -1;
                        }
                    }
                }
            }

            size = list.size();
        }

        System.out.println("answer = " + answer);
    }
}
