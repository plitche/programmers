package com.company.lv2.day_230925;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/87946
public class Q2_n2배열자르기_answer2 {

//    private static int n = 4;
//    private static long left = 0;
//    private static long right = 7;

    private static int n = 3;
    private static long left = 3;
    private static long right = 5;

    public static void main(String[] args) {
        List<Integer> ansList = new ArrayList<>();
        for(long i=left; i<=right; i++){
            if(i/n <= i%n)
                ansList.add((int)(i%n) + 1);
            else
                ansList.add((int)(i/n) + 1);
        }

        int[] answer = new int[ansList.size()];

        for(int i=0; i<answer.length; i++)
            answer[i] = ansList.get(i);

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}
