package com.company.lv2.day_230918;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

// https://school.programmers.co.kr/learn/courses/30/lessons/176962
public class Q2_과제진행하기_wrong {

    private static String[][] plans = {
            {"korean", "11:40", "30"},
            {"english", "12:10", "20"},
            {"math", "12:30", "40"},
    };

    public static void main(String[] args) {
        // 과제 리스트<시작시간, 과목명>
        HashMap<Integer, String> subjectMap = new HashMap<>();
        // 과제 시작 순서
        ArrayList<Integer> timeList = new ArrayList<>();
        // <과목명, 종료 시간>
        HashMap<String, Integer> map = new HashMap<>();

        for (int i=0; i<plans.length-1; i++) {
            String subject = plans[i][0];
            String[] times = plans[i][1].split(":");
            int start = Integer.parseInt(times[0])*60 + Integer.parseInt(times[1]);
            int time = start + Integer.parseInt(plans[i][2]);

            subjectMap.put(start, subject);
            timeList.add(start);
            map.put(subject, time);
        }

        // 정렬
        Collections.sort(timeList);

        ArrayList<String> leftSubject = new ArrayList<>();
        String prevSubject = subjectMap.get(timeList.get(0)); // 첫 과목
        int prevEndTime = map.get(prevSubject); // 첫 과목 종료 시간
        int leftTime = 0; // 여유 시간

        ArrayList<String> answer = new ArrayList<>();

        for (int i=1; i<timeList.size(); i++) {
            int time = timeList.get(i);

            String subject = subjectMap.get(time);
            Integer endTime = map.get(subject);

            if (prevEndTime < endTime) {
                answer.add(prevSubject);

                // 여유 시간 계산
                leftTime = endTime - prevEndTime;

                for (int j=0; j<leftSubject.size(); j++) {
                    String s = leftSubject.get(j);
                    Integer leftSubjectTime = map.get(s);

                    if (leftTime == 0) { // 여유시간 없으면 break;
                        break;
                    }

                    if (leftSubjectTime - leftTime > 0) { // 모두 소진 불가할 때
                        leftTime = 0;
                        map.put(s, leftSubjectTime-leftTime);
                        break;
                    } else { // 모두 소진 가능할 때
                        map.put(s, 0);
                        leftTime -= leftSubjectTime;
                        answer.add(s);
                    }
                }

                // 끝낸 과목 초기화
                map.put(subject, 0);

                // 이전 과목 시간 초기화
                prevSubject = subject;
                prevEndTime = endTime;
            } else {

            }
        }

        for (String s : answer) {
            System.out.print(s + " ");
        }
    }
}
