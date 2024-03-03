package com.company.lv0.day_240303;

// https://school.programmers.co.kr/learn/courses/30/lessons/181930
public class Q2_주사위게임2 {

//    private static int a = 2;
//    private static int b = 6;
//    private static int c = 1;

    private static int a = 5;
    private static int b = 3;
    private static int c = 3;

    public static void main(String[] args) {
        int answer = 0;

        if (a == b && b == c) {
            answer = (a+b+c)
                    * (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2))
                    * (int)(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
        } else if (a == b || b == c || a == c) {
            answer = (a+b+c) * (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        } else {
            answer = a+b+c;
        }

        System.out.println("answer = " + answer);
    }
}
