package com.company.lv1.day_230901;

// https://school.programmers.co.kr/learn/courses/30/lessons/72410
public class Q2_신규아이디추천 {

    //private static String new_id = "...!@BaT#*..y.abcdefghijklm";
    //private static String new_id = "z-+.^.";
    //private static String new_id = "=.=";
    //private static String new_id = "123_.def";
    private static String new_id = "abcdefghijklmn.p";

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<new_id.length(); i++) {
            char temp = new_id.charAt(i);

            if (temp >= 'A' && temp <= 'Z') {
                sb.append((char)(temp + 32));
            } else {
                sb.append(temp);
            }
        }

        new_id = sb.toString();
        sb = new StringBuilder();
        new_id = new_id.replaceAll("[^a-z0-9_\\-.]", "");
        int count = 0;
        for (int i=0; i<new_id.length(); i++) {
            char temp = new_id.charAt(i);

            if (temp == '.') {
                if (count > 0) {
                    continue;
                } else {
                    count += 1;
                }
            } else {
                count = 0;
            }

            sb.append(temp);
        }

        new_id = sb.toString();
        if (new_id.startsWith(".")) new_id = new_id.substring(1);
        if (new_id.endsWith(".")) new_id = new_id.substring(0, new_id.length()-1);

        int length = new_id.length();
        if (length == 0) {
            new_id = "aaa";
        } else if (length < 3) {
            char last = new_id.charAt(length - 1);
            for (int i=0; i<3-length; i++) {
                new_id += last;
            }
        } else if (length > 15) {
            new_id = new_id.substring(0, 15);
            if (new_id.endsWith(".")) new_id = new_id.substring(0, new_id.length()-1);
        }

        System.out.println("answer = " + new_id);
    }

}
