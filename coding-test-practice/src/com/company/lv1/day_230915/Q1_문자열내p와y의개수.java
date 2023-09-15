package com.company.lv1.day_230915;

// https://school.programmers.co.kr/learn/courses/30/lessons/12916
public class Q1_문자열내p와y의개수 {

    private static String s = "pPoooyY";

    public static void main(String[] args) {
        int pCount = 0;
        int yCount = 0;

        s = s.toLowerCase();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'p') pCount++;
            else if (c == 'y') yCount++;
        }

        System.out.println(pCount == yCount);
    }

}
