package com.company.lv0.day_240301;

// https://school.programmers.co.kr/learn/courses/30/lessons/181932
public class Q5_코드처리하기_answer {

//    private static String code = "abc1abc1abc";
    private static String code = "";

    public static void main(String[] args) {
        StringBuilder answer = new StringBuilder();
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            char current = code.charAt(i);
            if (current == '1') {
                mode = mode == 0 ? 1 : 0;
                continue;
            }

            if (i % 2 == mode) {
                answer.append(current);
            }
        }
        
        System.out.println("answer = " + (answer.length() == 0 ? "EMPTY" : answer.toString()));
    }
}
