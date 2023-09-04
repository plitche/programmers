package com.company.lv1.day_230904;

import java.util.*;

// https://school.programmers.co.kr/learn/courses/30/lessons/42889
public class Q1_실패율 {

//    private static int N = 5;
//    private static int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

    private static int N = 4;
    private static int[] stages = {4, 4, 4, 4, 4};

    public static void main(String[] args) {
        int[] answer = new int[N];

        Map<Integer, Double> map = new HashMap<>();
        ArrayList<Double> list = new ArrayList<>();
        for (int i=1; i<=N; i++) {
            double total = 0; // 총 시도 인원
            double pass = 0; // 성공한 인원

            for (int j=0; j<stages.length; j++) {
                int stage = stages[j];

                if (stage > i) { // 통과한 경우
                    total += 1;
                    pass += 1;
                } else if (stage == i) { // 실패한 경우
                    total += 1;
                }
            }

            double temp = pass/total;

            map.put(i, temp);
            list.add(temp);
        }

        Collections.sort(list); // 정렬

        for (int i=0; i<N; i++) {
            for (Integer integer : map.keySet()) {
                if(list.get(i).equals(map.get(integer))) { // 실패율이 높은 수부터 비교
                    answer[i] = integer;
                    map.remove(integer);
                    break;
                }
            }
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}
