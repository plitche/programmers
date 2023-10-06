package com.company.lv2.day_231006;

import java.util.HashSet;
import java.util.Set;

// https://school.programmers.co.kr/learn/courses/30/lessons/42577
public class Q1_전화번호목록_time2 {

    // private static String[] phone_book = {"119", "97674223", "1195524421"};
    // private static String[] phone_book = {"123","456","789"};
    private static String[] phone_book = {"12","123","1235","567","88"};

    public static void main(String[] args) {
        boolean answer = true;

        Set<String> set = new HashSet<>();
        for (String s : phone_book) {
            set.add(s);
        }

        for (String s : phone_book) {
            for (String s1 : set) {
                if (!s.equals(s1) && s1.startsWith(s)) {
                    answer = false;
                    break;
                }
            }

            if (!answer) break;
        }

        System.out.println("answer = " + answer);
    }

}
