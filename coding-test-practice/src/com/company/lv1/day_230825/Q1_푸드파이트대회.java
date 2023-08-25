package com.company.lv1.day_230825;

public class Q1_푸드파이트대회 {

    private static int[] food = {1, 3, 4, 6};
    public static void main(String[] args) {
        String answer = "";

        String temp = "";
        for (int i=1; i< food.length; i++) {
            if (food[i] > 1) {
                temp += i;
                food[i] -= 2;

                if (food[i] > 1) {
                    i-=1;
                }
            }
        }

        answer += temp + "0";
        for (int i=temp.length()-1; i>=0; i--) {
            answer += temp.charAt(i);
        }

        System.out.println("answer = " + answer);
    }
}
