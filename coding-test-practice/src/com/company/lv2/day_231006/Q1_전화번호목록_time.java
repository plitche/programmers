package com.company.lv2.day_231006;

// https://school.programmers.co.kr/learn/courses/30/lessons/42577
public class Q1_전화번호목록_time {

    // private static String[] phone_book = {"119", "97674223", "1195524421"};
    // private static String[] phone_book = {"123","456","789"};
    private static String[] phone_book = {"12","123","1235","567","88"};

    public static void main(String[] args) {
        boolean answer = true;

        boolean isStop = false;
        for (String s : phone_book) {
            for (String s1 : phone_book) {
                if (!s.equals(s1)) {
                    if (s1.startsWith(s)) {
                        answer = false;
                        isStop = true;
                        break;
                    }
                }
            }

            if (isStop) break;
        }

        System.out.println("answer = " + answer);
    }

}
