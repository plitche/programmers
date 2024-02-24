package com.company.lv0.day_240224;

// https://school.programmers.co.kr/learn/courses/30/lessons/181914
public class Q3_9로나눈나머지_lamda {

//    private static String number = "123";
     private static String number = "78720646226947352489";

    public static void main(String[] args) {
        int answer = number.chars().map(c -> (c - '0') % 9).sum() % 9;;

        System.out.println("answer = " + answer);
    }
}
