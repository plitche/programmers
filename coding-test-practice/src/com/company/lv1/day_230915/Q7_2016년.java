package com.company.lv1.day_230915;

// https://school.programmers.co.kr/learn/courses/30/lessons/12901
public class Q7_2016년 {

    private static int a = 5;
    private static int b = 24;

//    private static int a = 2;
//    private static int b = 29;

//    private static int a = 1;
//    private static int b = 29;

//    private static int a = 2;
//    private static int b = 5;

    public static void main(String[] args) {
        int sum = 0;
        for (int i=1; i<a; i++) {
            if (i == 2) {
                sum += 29;
            } else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                sum += 31;
            } else {
                sum += 30;
            }
        }
        sum += b-1;
        sum = sum%7;
        String[] days = {"FRI","SAT","SUN","MON","TUE","WED","THU"};

        System.out.println(days[sum]);
    }

}
