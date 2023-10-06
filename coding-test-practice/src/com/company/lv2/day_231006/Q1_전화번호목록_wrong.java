package com.company.lv2.day_231006;

import java.util.*;

// https://school.programmers.co.kr/learn/courses/30/lessons/42577
public class Q1_전화번호목록_wrong {

    // private static String[] phone_book = {"119", "97674223", "1195524421"};
    // private static String[] phone_book = {"123","456","789"};
    private static String[] phone_book = {"12","123","1235","567","88"};

    public static void main(String[] args) {
        boolean answer = true;

        Set<String> set = new HashSet<>();
        for (int i=phone_book.length-1; i>=0; i--) {
            String s = phone_book[i];
            for (String s1 : set) {
                if (s1.startsWith(s)) {
                    answer = false;
                    break;
                }
            }

            if (!answer) break;
            set.add(s);
        }

        System.out.println("answer = " + answer);
    }

}
