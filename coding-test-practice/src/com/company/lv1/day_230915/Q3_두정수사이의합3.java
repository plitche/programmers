package com.company.lv1.day_230915;

// https://school.programmers.co.kr/learn/courses/30/lessons/12912
public class Q3_두정수사이의합3 {

    private static int a = -1;
    private static int b = 6;

    public static void main(String[] args) {
        long max = Math.max(a, b);
        long min = Math.min(a, b);

        System.out.println( ((max-min)%2 != 1) ? (max+min) * ((max-min+1)/2) + (max+min)/2 : (max+min) * ((max-min+1)/2) );
    }

}
