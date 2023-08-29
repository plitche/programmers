package com.company.lv1.day_230829;

import java.util.ArrayList;
import java.util.Collections;

// https://school.programmers.co.kr/learn/courses/30/lessons/131128
public class Q1_숫자짝꿍_time4 {

    //private static String X = "100";
    //private static String Y = "2345";

    //private static String X = "100";
    //private static String Y = "203045";

    private static String X = "12321";
    private static String Y = "42531";

    public static void main(String[] args) {
        String answer = "";

        int xlength = X.length();
        int ylength = Y.length();

        ArrayList<String> list = new ArrayList<>();

        if (xlength > ylength) {
            for (int i=0; i<ylength; i++) {
                String temp = String.valueOf(Y.charAt(i));
                if (X.contains(temp)) {
                    list.add(temp);
                    X.replaceFirst(temp, "");
                }
            }
        } else {
            for (int i=0; i<xlength; i++) {
                String temp = String.valueOf(X.charAt(i));
                if (Y.contains(temp)) {
                    list.add(temp);
                    Y = Y.replaceFirst(temp, "");
                }
            }
        }

        Collections.sort(list, Collections.reverseOrder());

        for (String s : list) {
            answer += s;
        }

        if (answer.equals("")) {
            answer = "-1";
        } else if (answer.replace("0", "").equals("")) {
            answer = "0";
        }

        System.out.println("answer = " + answer);
    }
}
