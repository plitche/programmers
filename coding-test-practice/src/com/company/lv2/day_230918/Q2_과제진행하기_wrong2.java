package com.company.lv2.day_230918;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// https://school.programmers.co.kr/learn/courses/30/lessons/176962
public class Q2_과제진행하기_wrong2 {

//    private static String[][] plans = {
//            {"korean", "11:40", "30"},
//            {"english", "12:10", "20"},
//            {"math", "12:30", "40"},
//    };

    private static String[][] plans = {
            {"science", "12:40", "50"},
            {"music", "12:20", "40"},
            {"history", "14:00", "30"},
            {"computer", "12:30", "100"}
    };
    // music computer science history
    public static void main(String[] args) {
        // 과제 리스트<시작시간, 과목명>
        HashMap<Integer, String> subjectMap = new HashMap<>();
        // 과제 시작 순서
        ArrayList<Integer> timeList = new ArrayList<>();
        // <과목명, 종료 시간>
        HashMap<String, Integer> map = new HashMap<>();

        for (int i=0; i<plans.length; i++) {
            String subject = plans[i][0];
            String[] times = plans[i][1].split(":");
            int start = Integer.parseInt(times[0])*60 + Integer.parseInt(times[1]);
            int time = start + Integer.parseInt(plans[i][2]);

            subjectMap.put(start, subject);
            timeList.add(start);
            map.put(subject, time);
        }

        System.out.println("map = " + map);

        // 정렬
        Collections.sort(timeList);

        ArrayList<String> answer = new ArrayList<>();
        ArrayList<String> leftSubjects = new ArrayList<>();
        Map<String, Integer> leftSubject = new HashMap<>();

        String prevSubject = subjectMap.get(timeList.get(0));
        int prevEndTime = map.get(prevSubject);
        int leftTime = 0;

        for (int i=1; i<timeList.size(); i++) {
            int startTime = timeList.get(i);
            String subject = subjectMap.get(startTime);
            Integer endTime = map.get(subject);

            if (prevEndTime > startTime) {
                leftTime -= prevEndTime - startTime; // 모자란 시간 -

                leftSubjects.add(prevSubject); // 모자란 과목 add
                leftSubject.put(prevSubject, leftTime * -1); // 모자란 시간 put
            } else {
                leftTime += startTime - prevEndTime; // 남는 시간 +
                answer.add(prevSubject);

                // 모자란 애들 체크 해야함
                for (int j=0; j<leftSubjects.size(); j++) {
                    String s = leftSubjects.get(j);
                    Integer p = leftSubject.get(s);

                    if (leftTime == 0) {
                        break;
                    }

                    if (leftTime >= p) { // 남은 시간이 더 많으면
                        leftTime -= p;
                        timeList.remove(s);
                        answer.add(s);
                    } else { // 남은 시간이 더 적으면
                        leftSubject.put(s, leftSubject.get(s) - leftTime);
                        leftTime = 0;
                        break;
                    }
                }
            }

            prevSubject = subject;
            prevEndTime = endTime;
        }

        answer.add(subjectMap.get(timeList.get(timeList.size()-1))); // 마지막 과목은 무조건 추가

        for (String s : answer) {
            System.out.print(s + " ");
        }
    }
}
