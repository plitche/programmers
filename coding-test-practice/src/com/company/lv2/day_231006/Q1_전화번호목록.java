package com.company.lv2.day_231006;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// https://school.programmers.co.kr/learn/courses/30/lessons/42577
public class Q1_전화번호목록 {

    // private static String[] phone_book = {"119", "97674223", "1195524421"};
    // private static String[] phone_book = {"123","456","789"};
    private static String[] phone_book = {"12","123","1235","567","88"};

    public static void main(String[] args) {
        boolean answer = true;

        Arrays.sort(phone_book);

        for (int i=0; i<phone_book.length-1; i++) {
            if (phone_book[i+1].startsWith(phone_book[i])) {
                answer = false;
                break;
            }
        }

        System.out.println("answer = " + answer);
    }

}
