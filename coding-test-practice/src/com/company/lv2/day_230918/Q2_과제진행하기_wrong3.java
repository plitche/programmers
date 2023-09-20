package com.company.lv2.day_230918;

import java.util.*;

// https://school.programmers.co.kr/learn/courses/30/lessons/176962
public class Q2_과제진행하기_wrong3 {

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
        ArrayList<String> answerList = new ArrayList<>();

        for (int i=0; i<plans.length; i++) {
            String[] times = plans[i][1].split(":");
            plans[i][1] = String.valueOf(Integer.parseInt(times[0]) * 60);
        }

        // 정렬
        Arrays.sort(plans, Comparator.comparing(arr -> arr[1]));

        ArrayList<String> leftSubject = new ArrayList<>(); // 모자란 과목
        HashMap<String, Integer> map = new HashMap<>(); // 모자란 시간
        int leftTime = 0;

        String prevSubject = plans[0][0];
        int prevStart = Integer.parseInt(plans[0][1]);
        int prevHowLong = Integer.parseInt(plans[0][2]);

        int sum = 0;
        for (int i=0; i<plans.length-1; i++) {
            String subject = plans[i][0];
            int start = Integer.parseInt(plans[i][1]);
            int howLong = Integer.parseInt(plans[i][2]);

            if (prevStart+prevHowLong > start) {
                int left = prevStart+prevHowLong - start;

                leftTime -= left; // 모자란 시간만큼 -
                leftSubject.add(prevSubject);
                map.put(prevSubject, left);
                sum += left;
            } else {
                if (leftSubject.size() > 1) { // 시간이 모자란 과목이 있으면
                    leftTime += start - prevStart+prevHowLong; // 남는 시간만큼 +

                    if (sum < leftTime) {
                        leftTime = sum;
                    }
                }
                answerList.add(prevSubject);
            }

            prevSubject = subject;
            prevStart = start;
            prevHowLong = howLong;
        }

        for (int i=0; i<leftSubject.size(); i++) {
            String subject = leftSubject.get(i);

            Integer integer = map.get(subject);
            if (leftTime > integer) {
                leftTime -= integer;
                answerList.add(subject);
            } else {
                break;
            }
        }

        for (String s : answerList) {
            System.out.print(s + " ");
        }
    }
}
