package com.company.lv2.day_230922;

// https://school.programmers.co.kr/learn/courses/30/lessons/154538
public class Q1_숫자변환하기_wrong {

//    private static int x = 10;
//    private static int y = 40;
//    private static int n = 5;

//    private static int x = 10;
//    private static int y = 40;
//    private static int n = 30;

//    private static int x = 2;
//    private static int y = 5;
//    private static int n = 4;

    private static int x = 5;
    private static int y = 18;
    private static int n = 2;

    public static void main(String[] args) {
        int answer = 0;

        while(x != y) {
            int min = check(x, y, n);
            if(min == Integer.MAX_VALUE) {
                answer = -1;
                break;
            }
            answer += 1;
            y = min;
        }

        System.out.println("answer = " + answer);
    }

    public static int check(int x, int y, int n) {
        int minus = y-n < x ? Integer.MAX_VALUE : y-n;

        int divide2 = y%2 == 0 ? y/2 : Integer.MAX_VALUE;
        divide2 = divide2 < x ? Integer.MAX_VALUE : divide2;

        int divide3 = y%3 == 0 ? y/3 : Integer.MAX_VALUE;
        divide3 = divide3 < x ? Integer.MAX_VALUE : divide3;

        return Math.min(Math.min(minus, divide2), divide3);
    }

}
