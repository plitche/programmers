package com.company.lv0.day_240303;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/181926
public class Q6_수조작하기1 {

    private static int n = 0;
    private static String control = "wsdawsdassw";

    public static void main(String[] args) {
        for (int i = 0; i < control.length(); i++) {
            char c = control.charAt(i);

            switch (c) {
                case 'w' : n += 1; break;
                case 's' : n -= 1; break;
                case 'd' : n += 10; break;
                case 'a' : n -= 10; break;
            }
        }

        System.out.println("n = " + n);
    }
}
