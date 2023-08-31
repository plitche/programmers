package com.company.lv1.day_230831;

// https://school.programmers.co.kr/learn/courses/30/lessons/82612
public class Q3_부족한금액계산하기 {

    private static int price = 5;
    private static int money = 10;
    private static int count = 5;

    public static void main(String[] args) {
        long answer = -1;

        long sum = (price + price*count) * (long)(count/2);
        if (count%2 != 0) {
            sum += price*(count/2+1);
        }
        answer = money >= sum ? 0 : sum-money;
        System.out.println("answer = " + answer);
    }
}
