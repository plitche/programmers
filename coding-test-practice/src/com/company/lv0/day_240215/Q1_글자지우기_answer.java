package com.company.lv0.day_240215;

// https://school.programmers.co.kr/learn/courses/30/lessons/181900
public class Q1_글자지우기_answer {

    private static String my_string = "apporoograpemmemprs";
    private static int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};

    public static void main(String[] args) {
        String answer = "";
        String[] tmp = my_string.split("");

        for (int i = 0; i < indices.length; i++) {
            tmp[indices[i]] = "";
        }

        for (String x : tmp) {
            answer += x;
        }

        System.out.println("my_string = " + answer);
    }
}
