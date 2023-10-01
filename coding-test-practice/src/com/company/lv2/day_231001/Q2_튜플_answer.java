package com.company.lv2.day_231001;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// https://school.programmers.co.kr/learn/courses/30/lessons/64065
public class Q2_튜플_answer {

//    private static String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
//    private static String s = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
    private static String s = "{{4,2,3},{3},{2,3,4,1},{2,3}}";

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        String[] arr = s.replaceAll("[{]", " ").replaceAll("[}]", " ").trim().split(" , ");

        Arrays.sort(arr, (a, b)->{return a.length() - b.length();});
        int[] answer = new int[arr.length];
        int idx = 0;
        for(String s1 : arr) {
            for(String s2 : s1.split(",")) {
                if(set.add(s2)) {
                    answer[idx++] = Integer.parseInt(s2);
                    break;
                }
            }
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}
