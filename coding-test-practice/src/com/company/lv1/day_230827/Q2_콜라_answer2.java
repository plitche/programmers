package com.company.lv1.day_230827;

public class Q2_콜라_answer2 {

    //private static int a = 2;
    //private static int b = 1;
    //private static int n = 20;

    private static int a = 3;
    private static int b = 2;
    private static int n = 20;

    public static void main(String[] args) {
        int answer = recursive(a, b, n, 0);
        System.out.println("answer = " + answer);
    }

    public static int recursive(int a, int b, int n, int result) {
        if (n < a) {
            return result;
        }

        int change = (n / a) * b;

        n = (n % a) + change;

        return recursive(a, b, n, result + change);
    }
}
