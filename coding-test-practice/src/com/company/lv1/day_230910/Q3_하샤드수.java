package com.company.lv1.day_230910;

// https://school.programmers.co.kr/learn/courses/30/lessons/12947
public class Q3_하샤드수 {

    //private static int x  = 10;
    // private static int x  = 12;
    private static int x  = 11;

    public static void main(String[] args) {
        int sum = 0;
        int divide = x;
        while(divide > 0) {
            sum += divide%10;
            divide/=10;
        }

        System.out.println(x%sum == 0 ? true : false);
    }

}
