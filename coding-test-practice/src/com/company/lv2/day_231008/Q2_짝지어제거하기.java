package com.company.lv2.day_231008;

import java.util.Stack;

// https://school.programmers.co.kr/learn/courses/30/lessons/12980
public class Q2_짝지어제거하기 {

//    private static String s = "baabaa";
    private static String s = "cdcd";

    public static void main(String[] args) {
        int answer = 0;
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char c : chars) {
            if (stack.isEmpty()) stack.push(c);
            else {
                if (stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }

        answer = stack.isEmpty() ? 1 : 0;
        System.out.println("answer = " + answer);
    }

}
