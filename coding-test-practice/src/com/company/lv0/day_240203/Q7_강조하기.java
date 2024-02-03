package com.company.lv0.day_240203;

// https://school.programmers.co.kr/learn/courses/30/lessons/181874
public class Q7_강조하기 {

    private static String myString = "abstract algebra";
    // private static String myString = "PrOgRaMmErS";

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        char[] chars = myString.toLowerCase().toCharArray();
        for (char aChar : chars) {
            if (aChar == 'a') sb.append("A");
            else sb.append(aChar);
        }

        System.out.println("sb = " + sb);
    }
}
