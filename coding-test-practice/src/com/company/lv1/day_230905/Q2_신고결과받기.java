package com.company.lv1.day_230905;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// https://school.programmers.co.kr/learn/courses/30/lessons/92334
public class Q2_신고결과받기 {

//    private static String[] id_list = {"muzi", "frodo", "apeach", "neo"};
//    private static String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
//    private static int k = 2;

    private static String[] id_list = {"con", "ryan"};
    private static String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
    private static int k = 3;

    public static void main(String[] args) {
        int[] answer = new int[id_list.length];

        // 중복 값 제거
        Set<String> set = Arrays.stream(report).collect(Collectors.toSet());
        HashMap<String, StringBuilder> reportMap = new HashMap<>();

        HashMap<String, Integer> map = new HashMap<>();
        for (String s : set) { // 중복제거 set 반복
            String[] split = s.split(" ");
            String target = split[1];

            StringBuilder sb = reportMap.getOrDefault(target, new StringBuilder());
            reportMap.put(target, sb.append(split[0] + " ")); // 공백을 기준으로 신고당한 사람의 key에 신고자를 저장

            map.put(target, map.getOrDefault(target, 0)+1); // 신고당한 횟수 저장
        }

        HashMap<String, Integer> answerMap = new HashMap<>();
        int idLength = id_list.length;
        for (int i=0; i<idLength; i++) {
            String temp = id_list[i];

            if (map.getOrDefault(temp, 0) >= k) { // 정지 기준 넘은 경우
                // answerMap.put(temp, answerMap.getOrDefault(temp, 0) + 1); // 신고 당한사람

                StringBuilder sb = reportMap.get(temp);
                String[] split = sb.toString().trim().split(" ");
                for (String s : split) {
                    answerMap.put(s, answerMap.getOrDefault(s, 0) + 1); // 신고한 사람
                }
            }

            if(!answerMap.containsKey(temp)) answerMap.put(temp, 0);
        }

        for (int i=0; i<idLength; i++) {
            answer[i] = answerMap.get(id_list[i]);
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }

}
