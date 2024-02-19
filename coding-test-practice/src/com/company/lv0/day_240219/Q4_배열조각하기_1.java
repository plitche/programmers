package com.company.lv0.day_240219;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/181893
public class Q4_배열조각하기_1 {

//    private static int[] arr = {0, 1, 2, 3, 4, 5};
//    private static int[] query = {4, 1, 2};

//    private static int[] arr = {4, 5, 4};
//    private static int[] query = {1, 0};

    private static int[] arr = {0, 1, 2, 3, 4, 5, 6, 7};
    private static int[] query = {4, 1, 2};

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }

        for (int i = 0; i < query.length; i++) {
            if (i%2 == 0) {
                int size = list.size() - (query[i]+1);
                while(size > 0) {
                    list.remove(query[i]+1);
                    size--;
                }
            } else {
                int size = query[i];
                while(size > 0) {
                    list.remove(0);
                    size--;
                }
            }
        }

        list.toArray(new Integer[0]);
        System.out.println("answer = " + list);
    }
}
