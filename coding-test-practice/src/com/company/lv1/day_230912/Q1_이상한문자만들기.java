package com.company.lv1.day_230912;

// https://school.programmers.co.kr/learn/courses/30/lessons/12930
public class Q1_이상한문자만들기 {

    //private static String s = "try hello world";
    //private static String s = "AA aa ZZ zz";
    private static String s = "aa  a   ";

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String[] split = s.split(" ");

        for (int i=0; i<split.length; i++) {
            String str = split[i];

            for (int j=0; j<str.length(); j++) {
                String temp = String.valueOf(str.charAt(j));

                if (j%2 == 0) sb.append(temp.toUpperCase());
                else sb.append(temp.toLowerCase());
            }

            if (i != split.length-1) {
                sb.append(" ");
            }
        }

        int start = sb.toString().length();
        int end = s.length();
        for (int i=start; i<end; i++) {
            sb.append(" ");
        }

        System.out.println("sb = " + sb);
    }
}
