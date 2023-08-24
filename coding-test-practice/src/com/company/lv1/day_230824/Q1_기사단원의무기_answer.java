package com.company.lv1.day_230824;

// https://school.programmers.co.kr/learn/courses/30/lessons/136798
public class Q1_기사단원의무기_answer {

    //private static int number = 5;
    //private static int limit = 3;
    //private static int power = 2;
    // 1, 1/2 ,1/3, 1/2/4, 1/5

    //private static int number = 10;
    //private static int limit = 3;
    //private static int power = 1;
    // 1, 1/2 ,1/3, 1/2/4, 1/5, 1/2/3/6, 1/7, 1/2/4/8, 1/3/9, 1/2/5/10 : 27

    private static int number = 16;
    private static int limit = 5;
    private static int power = 2;
    // 1/11, 1/2/3/4/6/12, 1/13, 1/2/7/14, 1/3/5/15, 1/2/4/8/16

    public static void main(String[] args) {
        int sum = 0;

        for (int num = 1; num <= number; num++) {
            int divisor = countOfDivisor(num);
            sum += divisor > limit ? power : divisor;
        }

        System.out.println("sum = " + sum);
    }

    private static int countOfDivisor(int num) {
        int divisorCount = 0;

        // 절반까지만 계산
        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) {
                divisorCount++;
            } else if (num % i == 0) {
                divisorCount += 2;
            }
        }

        return divisorCount;
    }

}
