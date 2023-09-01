package com.company.lv1.day_230901;

// https://school.programmers.co.kr/learn/courses/30/lessons/70128
public class Q4_3진법뒤집기 {

    private static int n = 45;

    public static void main(String[] args) {
        int answer = 0;

        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            int left = n%3;
            sb.append(left);
            n /= 3;
        }

        String temp = sb.toString();
        int power = 0;
        for (int i=temp.length()-1; i>=0; i--) {
            int num = Character.getNumericValue(temp.charAt(i));
            answer += num * Math.pow(3, power);
            power++;
        }

        System.out.println("answer = " + answer);
    }

}
