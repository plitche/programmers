package com.company.lv1.day_230915;

import java.util.Arrays;
import java.util.Comparator;

// https://school.programmers.co.kr/learn/courses/30/lessons/12916
public class Q2_문자열내마음대로정렬하기_answer {

//    private static String[] strings = {"sun", "bed", "car"};
//    private static int n = 1;

    private static String[] strings = {"abce", "abcd", "cdx"};
    private static int n = 2;

    public static void main(String[] args) {
        Arrays.sort(strings, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                if(s1.charAt(n) > s2.charAt(n)) return 1;
                else if(s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2);
                else if(s1.charAt(n) < s2.charAt(n)) return -1;
                else return 0;
            }
        });

        for (String s : strings) {
            System.out.println(s);
        }
    }

}
