package com.company.lv1.day_230911;

// https://school.programmers.co.kr/learn/courses/30/lessons/12934
public class Q3_자연수뒤집어배열로만들기2 {

    private static long n = 12345;

    public static void main(String[] args) {
        String s = String.valueOf(n);

        int[] answer = new int[s.length()];
        char[] chars = s.toCharArray();

        int idx = 0;
        for (int i=s.length()-1; i>=0; i--) {
            answer[idx] = chars[i] - '0';
            idx++;
        }

        System.out.println("answer = " + answer);
    }
}
