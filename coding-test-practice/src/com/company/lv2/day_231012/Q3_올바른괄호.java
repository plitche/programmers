package com.company.lv2.day_231012;

import java.util.Stack;

// https://school.programmers.co.kr/learn/courses/30/lessons/12909
public class Q3_올바른괄호 {

//    private static String s = "(())()";
//    private static String s = ")()(";
//    private static String s = "(()(";
    private static String s = "()))))";

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        char[] chars = s.toCharArray();
        if (chars[0] != ')') {
            for (char c : chars) {
                if (c == '(') stack.push(c);
                else {
                    if (stack.isEmpty()) {
                        stack.push('1');
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
        } else {
            stack.push('1');
        }

        System.out.println("answer = " + stack.isEmpty());
    }

}
