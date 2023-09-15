package com.company.lv1.day_230915;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/12916
public class Q2_문자열내마음대로정렬하기 {

//    private static String[] strings = {"sun", "bed", "car"};
//    private static int n = 1;

    private static String[] strings = {"abce", "abcd", "cdx"};
    private static int n = 2;

    public static void main(String[] args) {
        String[] answer = new String[strings.length];
        Arrays.sort(strings);

        char[] chars = new char[strings.length];
        for (int i=0; i<chars.length; i++) {
            chars[i] = strings[i].charAt(n);
        }
        Arrays.sort(chars);

        for (int i=0; i<chars.length; i++) {
            char c = chars[i];

            for (int j=0; j<strings.length; j++) {
                if (!strings[j].equals("") && strings[j].charAt(n) == c) {
                    answer[i] = strings[j];
                    strings[j] = "";
                    break;
                }
            }
        }

        for (String s : answer) {
            System.out.println(s);
        }
    }

}
