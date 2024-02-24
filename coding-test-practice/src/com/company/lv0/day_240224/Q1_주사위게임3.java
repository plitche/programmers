package com.company.lv0.day_240224;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://school.programmers.co.kr/learn/courses/30/lessons/181916
public class Q1_주사위게임3 {

    private static int a = 2;
    private static int b = 2;
    private static int c = 2;
    private static int d = 2;

//    private static int a = 4;
//    private static int b = 1;
//    private static int c = 4;
//    private static int d = 4;

//    private static int a = 6;
//    private static int b = 3;
//    private static int c = 3;
//    private static int d = 6;

    public static void main(String[] args) {
        int answer = 0;
        if (a == b && b == c && c == d) {
            answer = 1111 * a;
        } else if (a == b && b == c) {
            answer = ((10 * a + d) * (10 * a + d));
        } else if (a == c && c == d) {
            answer = ((10 * a + b) * (10 * a + b));
        } else if (a == b && b == d) {
            answer = ((10 * a + c) * (10 * a + c));
        } else if (b == c && c == d) {
            answer = ((10 * b + a) * (10 * b + a));
        } else if (a == b && c == d) {
            answer = ((a + c) * (Math.abs(a - c)));
        } else if (a == c && b == d) {
            answer = ((a + b) * (Math.abs(a - b)));
        } else if (a == d && b == c) {
            answer = ((a + b) * (Math.abs(a - b)));
        } else if (a == b && c != d) {
            answer = (c * d);
        } else if (a == c && b != d) {
            answer = (b * d);
        } else if (a == d && b != c) {
            answer = (b * c);
        } else if (b == c && a != d) {
            answer = (a * d);
        } else if (b == d && a != c) {
            answer = (a * c);
        } else if (c == d && a != b) {
            answer = (a * b);
        } else {
            answer = Math.min(Math.min(a, b), Math.min(c, d));
        }

        System.out.println("answer = " + answer);
    }
}
