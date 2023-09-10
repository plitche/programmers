package com.company.lv1.day_230910;

import java.util.ArrayList;

// https://school.programmers.co.kr/learn/courses/30/lessons/12940
public class Q8_제일작은수제거하기 {

    // private static int[] arr = {4, 3, 2, 1};
    // private static int[] arr = {10};
    private static int[] arr = {4, 3, 2, 1, 5};

    public static void main(String[] args) {
        int[] answer;
        if(arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[arr.length-1];
            int min = Integer.MAX_VALUE;
            int idx = 0;
            ArrayList<Integer> list = new ArrayList<>();

            for (int i=0; i<arr.length; i++) {
                int temp = arr[i];
                list.add(temp);
                if (temp < min) {
                    min = temp;
                    idx = i;
                }
            }

            list.remove(idx);

            for (int i=0; i<list.size(); i++) {
                answer[i] = list.get(i);
            }
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }

}
