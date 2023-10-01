package com.company.lv2.day_231001;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// https://school.programmers.co.kr/learn/courses/30/lessons/64065
public class Q2_튜플_answer2 {

//    private static String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
//    private static String s = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
    private static String s = "{{4,2,3},{3},{2,3,4,1},{2,3}}";

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            String n = matcher.group();
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int size = map.size();
        int[] answer = new int[size];
        for (String key: map.keySet()) {
            answer[size - map.get(key)] = Integer.parseInt(key);
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}
