package com.company.lv2.day_230917;

import java.util.Arrays;
import java.util.Comparator;

// https://school.programmers.co.kr/learn/courses/30/lessons/181188
public class Q1_요격시스템 {

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

        // 두번째 값 기준 오름차순 정렬
        Arrays.sort(targets, Comparator.comparingInt(arr -> arr[1]));

        for (int i=0; i<targets.length; i++) {
            if (targets[i][1] != -1) { // 이미 포격된 미사일이 아닐 때
                double shoot = targets[i][1]-0.1; // 마지막 지점 -0.1로 포격위치 잡기

                for (int j=i+1; j<targets.length; j++) {
                    int temp = targets[j][0];

                    // 포격위치 보다 시작지점이 더 작으면 같이 포격 && 이미 포격된 미사일이 아닐 때
                    if (temp < shoot && temp != -1) {
                        targets[j][1] = -1; // 포격된 미사일 초기화
                    }
                }

                targets[i][0] = -1;
                targets[i][1] = -1;
                answer+=1;
            }
        }

        System.out.println("answer = " + answer);
    }

}
