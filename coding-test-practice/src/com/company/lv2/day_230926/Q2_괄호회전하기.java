package com.company.lv2.day_230926;

import java.util.Stack;

// https://school.programmers.co.kr/learn/courses/30/lessons/84512
public class Q2_괄호회전하기 {

    // private static String s = "[](){}";
    private static String s = "{}}}}";

    public static void main(String[] args) {
        int answer = 0;

        for (int i=0; i<s.length(); i++) {
            if(check(s)) {
                answer += 1;
            }
            if (s.length() != 1) {
                s = s.substring(1) + s.charAt(0);
            }
        }

        System.out.println("answer = " + answer);
    }

    public static boolean check(String s) {
        char start = s.charAt(0);
        char end = s.charAt(s.length()-1);

        if (start == ']' || start == ')' || start == '}') {
            return false;
        }
        if (end == '[' || end == '(' || end == '{') {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);

            if (c == ']') {
                if (!stack.isEmpty()) {
                    if (stack.peek() != '[') {
                        return false;
                    } else {
                        stack.pop();
                    }
                } else {
                    return false;
                }
            } else if (c == ')') {
                if (!stack.isEmpty()) {
                    if (stack.peek() != '(') {
                        return false;
                    } else {
                        stack.pop();
                    }
                } else {
                    return false;
                }
            } else if (c == '}') {
                if (!stack.isEmpty()) {
                    if (stack.peek() != '{') {
                        return false;
                    } else {
                        stack.pop();
                    }
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        if (stack.isEmpty()) return true;
        else return false;
    }

}
