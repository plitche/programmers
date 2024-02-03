package com.company.lv0.day_240203;

// https://school.programmers.co.kr/learn/courses/30/lessons/181878
public class Q6_배열에서문자열대소문자변환하기 {

    private static String[] strArr = {"AAA","BBB","CCC","DDD"};
    // private static String[] strArr = {"aBc","AbC"};

    public static void main(String[] args) {
        for (int i = 0; i < strArr.length; i++) {
            if (i%2 == 0) strArr[i] = strArr[i].toLowerCase();
            else strArr[i] = strArr[i].toUpperCase();
        }

        for (String s : strArr) {
            System.out.println("s = " + s);
        }
    }
}
