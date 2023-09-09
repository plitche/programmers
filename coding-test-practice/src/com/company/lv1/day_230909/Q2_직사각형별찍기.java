package com.company.lv1.day_230909;

// https://school.programmers.co.kr/learn/courses/30/lessons/12969
public class Q2_직사각형별찍기 {
    private static int n = 5;
    private static int m = 3;

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++) sb.append("*");
        String temp = sb.toString();
        for (int i=1; i<m; i++ ) sb.append("\n").append(temp);
        System.out.println(sb);
    }
}