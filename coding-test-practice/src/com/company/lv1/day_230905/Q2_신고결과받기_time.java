package com.company.lv1.day_230905;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;

// https://school.programmers.co.kr/learn/courses/30/lessons/92334
public class Q2_신고결과받기_time {

//    private static String[] id_list = {"muzi", "frodo", "apeach", "neo"};
//    private static String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
//    private static int k = 2;

    private static String[] id_list = {"con", "ryan"};
    private static String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
    private static int k = 3;

    public static void main(String[] args) {
        int[] answer = new int[id_list.length];

        // 중복 값 제거
        report = Arrays.stream(report).distinct().toArray(String[]::new);

        HashMap<String, Integer> map = new HashMap<>();
        int length = report.length;
        for (int i=0; i<length; i++) {
            String target = report[i].split(" ")[1];
            map.put(target, map.getOrDefault(target, 0)+1);
        }

        HashMap<String, Integer> answerMap = new HashMap<>();
        int idLength = id_list.length;
        for (int i=0; i<idLength; i++) {
            String temp = id_list[i];

            if (map.getOrDefault(temp, 0) >= k) { // 정지 기준 넘은 경우

                for (int j=0; j<length; j++) {
                    String[] split = report[j].split(" ");

                    String reporter = split[0]; // 신고자
                    String target = split[1]; // 신고 당한 사람

                    if (target.equals(temp)) { // 신고 당한 사람이 같을 경우
                        answerMap.put(reporter, answerMap.getOrDefault(reporter, 0)+1); // 신고한 인원에게 +1
                    }
                }
            }
        }

        for (int i=0; i<idLength; i++) {
            answer[i] = answerMap.getOrDefault(id_list[i], 0);
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }

}
