package com.company.lv0.day_240303;

// https://school.programmers.co.kr/learn/courses/30/lessons/181931
public class Q1_등차수열의특정한항만더하기 {

//    private static int a = 3;
//    private static int b = 4;
//    private static boolean[] included = {true, false, false, true, true};

    private static int a = 7;
    private static int b = 1;
    private static boolean[] included = {false, false, false, true, false, false, false};

    public static void main(String[] args) {
        int answer = 0;

        for (boolean in : included) {
            if (in) answer += a;
            a += b;
        }

        System.out.println("answer = " + answer);
    }
}
