package com.company.lv0.day_240226;

// https://school.programmers.co.kr/learn/courses/30/lessons/181903
public class Q2_qrcode {

    private static int q = 3;
    private static int r = 1;
    private static String code = "qjnwezgrpirldywt";

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int i = r; i < code.length(); i+=q) {
            sb.append(code.charAt(i));
        }

        System.out.println("answer = " + sb.toString());
    }
}
