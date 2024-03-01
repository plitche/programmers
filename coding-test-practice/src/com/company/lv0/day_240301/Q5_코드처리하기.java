package com.company.lv0.day_240301;

// https://school.programmers.co.kr/learn/courses/30/lessons/181932
public class Q5_코드처리하기 {

//    private static String code = "abc1abc1abc";
    private static String code = "";

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        boolean even = true;
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);

            if (c == '1') {
                even = !even;
                continue;
            }

            if (even) {
                if (i%2 == 0) sb.append(c);
            } else {
                if (i%2 == 1) sb.append(c);
            }
        }
        
        System.out.println("answer = " + (sb.toString().equals("") ? "EMPTY" : sb.toString()));
    }
}
