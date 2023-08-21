package com.company.lv1.day_230821;

// https://school.programmers.co.kr/learn/courses/30/lessons/147355
public class Q1_크기가작은부분문자열 {

    private static String t = "500220839878";
    private static String p = "7";

    public static void main(String[] args) {
        int answer = 0;

        int aLength = t.length()-p.length();
        int pLength = p.length();

        Long temp = Long.parseLong(p);
        for (int i=0; i<=aLength; i++) {
            Long substring = Long.parseLong(t.substring(i, i + pLength));

            if (substring <= temp) {
                answer++;
            }
        }

        System.out.println("answer = " + answer);
    }
}
