package com.company.lv0.day_240224;

// https://school.programmers.co.kr/learn/courses/30/lessons/181914
public class Q3_9로나눈나머지 {

//    private static String number = "123";
     private static String number = "78720646226947352489";

    public static void main(String[] args) {
        int answer = 0;

        try {
            answer = Integer.valueOf(number)%9;
        } catch (NumberFormatException e) {
            for (int i = 0; i < number.length(); i++) {
                answer += number.charAt(i) - '0';
            }
            answer %= 9;
        }

        System.out.println("answer = " + answer);
    }
}
