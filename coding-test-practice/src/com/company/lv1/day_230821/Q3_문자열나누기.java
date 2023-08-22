package com.company.lv1.day_230821;

import java.util.ArrayList;
import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/140108
public class Q3_문자열나누기 {

    private static String s = "abaa";
    //private static String s = "banana";
    //private static String s = "abracadabra";
    //private static String s = "aaabbaccccabba";

    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();
        for (char c : s.toCharArray()) {
            list.add(c);
        }

        System.out.println("result : " + check(list, 0));
    }

    public static int check(ArrayList<Character> list, int count) {
        if (list.size() == 0) {
            return count;
        }

        if (list.size() == 1) {
            return count+1;
        }

        char temp = list.get(0); list.remove(0);
        int length = 1;
        for (int i=0; i<list.size(); i++) {
            if (temp == list.get(i)) {
                length+=1;
            } else {
                length-=1;
            }

            list.remove(i); i-=1;

            if (length == 0) {
                count+=1;
                break;
            }
        }

        if (length != 0) {
            return count+1;
        }

        if (list.size() > 0) {
            return check(list, count);
        }

        return count;
    }
}
