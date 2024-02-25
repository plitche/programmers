package com.company.lv0.day_240226;

// https://school.programmers.co.kr/learn/courses/30/lessons/181904
public class Q1_세로읽기 {

    private static String my_string = "ihrhbakrfpndopljhygc";
    private static int m = 4;
    private static int c = 2;

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for(int i = c-1; i < my_string.length(); i+=m) {
            sb.append(my_string.charAt(i));
        }

        System.out.println("answer = " + sb.toString());
    }
}
