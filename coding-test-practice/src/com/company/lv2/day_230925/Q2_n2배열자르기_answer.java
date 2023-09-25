package com.company.lv2.day_230925;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/87946
public class Q2_n2배열자르기_answer {

//    private static int n = 4;
//    private static long left = 0;
//    private static long right = 7;

    private static int n = 3;
    private static long left = 3;
    private static long right = 5;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for(long i=left; i<right+1; i++){
            list.add((int)Math.max(i/n , i%n) + 1);
        }

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}
