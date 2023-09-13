package com.company.lv1.day_230913;

// https://school.programmers.co.kr/learn/courses/30/lessons/12922
public class Q1_수박수박수박수 {

    private static int n = 3;

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++) {
            if(i%2 == 0) sb.append("수");
            else sb.append("박");
        }

        System.out.println("sb.toString() = " + sb.toString());
    }

}
