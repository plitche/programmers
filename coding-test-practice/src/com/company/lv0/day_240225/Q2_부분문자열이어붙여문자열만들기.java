package com.company.lv0.day_240225;

// https://school.programmers.co.kr/learn/courses/30/lessons/181911
public class Q2_부분문자열이어붙여문자열만들기 {

    private static String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
    private static int[][] parts = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_strings.length; i++) {
            sb.append(my_strings[i].substring(parts[i][0], parts[i][1]+1));
        }
        
        System.out.println("answer = " + sb);
    }
}
