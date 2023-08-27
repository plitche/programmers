package com.company.lv1.day_230827;

public class Q2_콜라_answer {

    //private static int a = 2;
    //private static int b = 1;
    //private static int n = 20;

    private static int a = 3;
    private static int b = 2;
    private static int n = 20;

    public static void main(String[] args) {
        int answer = (n > b ? n - b : 0) / (a - b) * b;
        System.out.println("answer = " + answer);
    }
}
