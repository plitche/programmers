package com.company.lv1.day_230910;

// https://school.programmers.co.kr/learn/courses/30/lessons/12940
public class Q6_최대공약수와최소공배수 {

    private static int n = 3;
    private static int m = 12;

    public static void main(String[] args) {
        int[] answer = new int[2];

        for (int i=n; i>0; i--) {
            if (n%i == 0 && m%i == 0) {
                answer[0] = i;
                answer[1] = n*m/i;
                break;
            }
        }

        for (int i : answer) {
            System.out.println("i = " + i);
        }
    }

}
