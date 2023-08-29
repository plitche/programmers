package com.company.lv1.day_230829;

// https://school.programmers.co.kr/learn/courses/30/lessons/131128
public class Q1_숫자짝꿍 {

    //private static String X = "100";
    //private static String Y = "2345";

    //private static String X = "100";
    //private static String Y = "203045";

    private static String X = "12321";
    private static String Y = "42531";

    public static void main(String[] args) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        int[] xArr = new int[10];
        for (int i=0; i<X.length(); i++) {
            xArr[X.charAt(i) - '0'] += 1;
        }

        int[] yArr = new int[10];
        for (int i=0; i<Y.length(); i++) {
            yArr[Y.charAt(i) - '0'] += 1;
        }

        for (int i=9; i>=0; i--) {
            int x = xArr[i];
            int y = yArr[i];

            if (x > 0 && y > 0) {
                int count = x > y ? y : x;

                for (int j=0; j<count; j++) {
                    sb.append(i);
                }
            }
        }

        answer = sb.toString();

        if (answer.equals("")) {
            answer = "-1";
        } else if (answer.replace("0", "").equals("")) {
            answer = "0";
        }

        System.out.println("answer = " + answer);
    }
}
