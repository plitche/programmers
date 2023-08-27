package com.company.lv1.day_230827;

public class Q2_콜라 {

    private static int a = 2;
    private static int b = 1;
    private static int n = 20;

    public static void main(String[] args) {
        int answer = check(a, b, n, 0);
        System.out.println("answer = " + answer);
    }

    public static int check(int input, int output, int left, int total) {
        if (left < input) {
            return total;
        }

        while(left >= input) {
            int temp = 0;
            temp += (left / input) * output;
            left = (left % input) + temp;
            total += temp;
        }

        return total;
    }
}
