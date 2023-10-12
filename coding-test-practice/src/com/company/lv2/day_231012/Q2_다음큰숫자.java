package com.company.lv2.day_231012;

import java.util.HashSet;
import java.util.Set;

// https://school.programmers.co.kr/learn/courses/30/lessons/12911
public class Q2_다음큰숫자 {

//    private static int n = 15;
    private static int n = 78;

    public static void main(String[] args) {
        int answer = n+1;

        int target = change(n);
        while (target != change(answer)) {
            answer++;
        }

        System.out.println("answer = " + answer);
    }

    public static int change(int num) {
        int count = 0;
        while(num > 0) {
            if (num%2 == 1) count++;
            num /= 2;
        }

        return count;
    }

}
