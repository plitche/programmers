package com.company.lv2.day_230917;

import java.util.Arrays;
import java.util.Comparator;

// https://school.programmers.co.kr/learn/courses/30/lessons/181188
public class Q1_요격시스템_answer {

    private static int[][] targets = {
            {4,5},
            {4,8},
            {10,14},
            {11,13},
            {5,12},
            {3,7},
            {1,4}
    };

    public static void main(String[] args) {
        int answer = 0;

        Arrays.sort(targets, (a, b) -> a[0] - b[0]); // x좌표 기준으로 정렬
        int last = -1;
        for (int i = 0; i < targets.length; i++) {
            int[] missile = targets[i];
            if (missile[0] > last) { // 새로운 요격 미사일 필요
                answer++;
                last = missile[1] - 1; // 해당 미사일로 커버되는 범위
            } else if (missile[1] - 1 < last) { // 더 작은 범위로 커버 가능한 미사일 필요
                last = missile[1] - 1; // 해당 미사일로 커버되는 범위
            }
        }

        System.out.println("answer = " + answer);
    }

}
