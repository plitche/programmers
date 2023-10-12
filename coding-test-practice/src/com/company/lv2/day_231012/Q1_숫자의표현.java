package com.company.lv2.day_231012;

import java.util.HashSet;
import java.util.Set;

// https://school.programmers.co.kr/learn/courses/30/lessons/12924
public class Q1_숫자의표현 {

    private static int n = 15;

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i=1; i<=n; i++) {
            for (int j=i; j<=n; j++) {
                sum += j;

                if (sum > n) {
                    break;
                }
                if (sum == n) {
                    set.add(i);
                    break;
                }
            }
            sum = 0;
        }

        System.out.println("answer = " + set.size());
    }

}
