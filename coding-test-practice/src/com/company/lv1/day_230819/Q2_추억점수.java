package com.company.lv1.day_230819;

import java.util.HashMap;

// https://school.programmers.co.kr/learn/courses/30/lessons/176963
public class Q2_추억점수 {

    private static String[] names = {"may", "kein", "kain", "radi"};
    private static int[] yearning = {5, 10, 1, 3};
    private static String[][] photo = {
        {"may", "kein", "kain", "radi"},
        {"may", "kein", "brin", "deny"},
        {"kon", "kain", "may", "coni"}
    };

    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();

        // Map 초기화
        for (int i=0; i<names.length; i++) {
            scores.put(names[i], yearning[i]);
        }

        // 결과 배열 초기화
        int xLength = photo.length;
        int[] answer = new int[xLength];

        // 사진 check
        for (int i = 0; i < xLength; i++) {
            int yLength = photo[i].length;
            int sum = 0; // 각 사진 합계
            for (int j=0; j<yLength; j++) {
                if (scores.get(photo[i][j]) != null) {
                    sum += scores.get(photo[i][j]);
                };
            }
            answer[i] = sum; // 합계 저장
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}
