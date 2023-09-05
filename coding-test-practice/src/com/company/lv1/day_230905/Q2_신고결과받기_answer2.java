package com.company.lv1.day_230905;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://school.programmers.co.kr/learn/courses/30/lessons/92334
public class Q2_신고결과받기_answer2 {

//    private static String[] id_list = {"muzi", "frodo", "apeach", "neo"};
//    private static String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
//    private static int k = 2;

    private static String[] id_list = {"con", "ryan"};
    private static String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
    private static int k = 3;

    public static void main(String[] args) {
        int[] answer = new int[id_list.length];
        Map<String, Integer> idIndex = new HashMap<>();
        Map<String, List<String>> reportMap = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            idIndex.put(id_list[i], i);
            reportMap.put(id_list[i], new ArrayList<>());
        }

        for (String reported : report) {
            String[] temp = reported.split(" ");
            if (!reportMap.get(temp[1]).contains(temp[0])) {
                reportMap.get(temp[1]).add(temp[0]);
            }
        }

        for (String id : reportMap.keySet()) {
            if (k <= reportMap.get(id).size()) {
                for (String reporter : reportMap.get(id)) {
                    answer[idIndex.get(reporter)]++;
                }
            }
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }

}
