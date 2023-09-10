package com.company.lv1.day_230910;

// https://school.programmers.co.kr/learn/courses/30/lessons/12948
public class Q2_핸드폰번호가리기 {

    private static String phone_number = "01033334444";

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int length = phone_number.length();
        for (int i=0; i<length-4; i++) sb.append("*");
        sb.append(phone_number.substring(length - 4));
        System.out.println("substring = " + sb.toString());
    }

}
