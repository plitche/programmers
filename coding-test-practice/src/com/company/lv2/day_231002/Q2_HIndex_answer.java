package com.company.lv2.day_231002;

import java.util.Arrays;
import java.util.HashMap;

// https://school.programmers.co.kr/learn/courses/30/lessons/42747
public class Q2_HIndex_answer {

//    private static int[] citations = {3, 0, 6, 1, 5};
    private static int[] citations = {0, 1, 2, 2, 2};

    public static void main(String[] args) {
        Arrays.sort(citations);

        int max = 0;
        for(int i = citations.length-1; i > -1; i--){
            int min = (int)Math.min(citations[i], citations.length - i);
            if(max < min) max = min;
        }

        System.out.println("max = " + max);
    }

}
