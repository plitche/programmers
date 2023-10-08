package com.company.lv2.day_231008;

// https://school.programmers.co.kr/learn/courses/30/lessons/12980
public class Q2_짝지어제거하기_wrong {

//    private static String s = "baabaa";
    private static String s = "cdcd";

    public static void main(String[] args) {
        int answer = 0;

        int count = 0;
        for (int i=0; i<s.length(); i++) {
            if (i == s.length()-1) {
                if (count == 0) break;
                i = -1;
                count = 0;
            }

            if (s.charAt(i) == s.charAt(i+1)) {
                s = s.substring(0, i) + s.substring(i+2);
                i = i <= 1 ? -1 : i-2;
                count++;
            }
        }

        answer = s.length() == 0 ? 1 : 0;
        System.out.println("answer = " + answer);
    }

}
