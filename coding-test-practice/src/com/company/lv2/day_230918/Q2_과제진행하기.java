package com.company.lv2.day_230918;

import java.util.ArrayList;
import java.util.HashMap;

// https://school.programmers.co.kr/learn/courses/30/lessons/176962
public class Q2_과제진행하기 {

    private static String[][] plans = {
            {"korean", "11:40", "30"},
            {"english", "12:10", "20"},
            {"math", "12:30", "40"},
    };

    public static void main(String[] args) {
        String[] answer = {};

        // 과제를 덜 끝낸 과목들 <과목명, 남은 시간>
        ArrayList<HashMap<String, Integer>> list = new ArrayList<>();
        //HashMap<String, Integer> map = new HashMap<>();

        String prev = "";
        int prevStart = 0;


        for (int i=0; i<plans.length-1; i++) {

        }

        for (String s : answer) {
            System.out.print(s + " ");
        }
    }
}
