package com.company.lv2;

import java.util.Arrays;
import java.util.Comparator;

// https://school.programmers.co.kr/learn/courses/30/lessons/181188
public class Q2_두원사이의정수쌍_wrong {

//    private static int r1 = 2;
//    private static int r2 = 3;

//    private static int r1 = 2;
//    private static int r2 = 4;

    private static int r1 = 1;
    private static int r2 = 2;

    public static void main(String[] args) {
        long answer = 0;

        long r2Count = (r2+1)*(r2+1) - (r2*2-1);
        long r1Count = (r1+1)*(r1+1) - (r1*2-1);

        answer = ((r2Count - r1Count + 2) - (r2-r1+1)) * 4;
        System.out.println("answer = " + answer);
    }

}
