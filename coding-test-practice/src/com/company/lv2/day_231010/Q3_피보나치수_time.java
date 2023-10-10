package com.company.lv2.day_231010;

// https://school.programmers.co.kr/learn/courses/30/lessons/12953
public class Q3_피보나치수_time {

//    private static int n = 3;
    private static int n = 100000;

    public static void main(String[] args) {
        int answer = (int)(math(n)%1234567);
        System.out.println("answer = " + answer);
    }

    public static long math(int num) {
        if (num <= 0) return 0;
        if (num == 1) return 1;
        return math(num-1) + math(num-2);
    }

}
