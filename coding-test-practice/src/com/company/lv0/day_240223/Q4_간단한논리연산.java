package com.company.lv0.day_240223;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/181917
public class Q4_간단한논리연산 {

//    private static boolean x1 = false;
//    private static boolean x2 = true;
//    private static boolean x3 = true;
//    private static boolean x4 = true;

    private static boolean x1 = true;
    private static boolean x2 = false;
    private static boolean x3 = false;
    private static boolean x4 = false;

    public static void main(String[] args) {
        System.out.println("i = " + ((x1 || x2) && (x3 || x4)));
    }
}
