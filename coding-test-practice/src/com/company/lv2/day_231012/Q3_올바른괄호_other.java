package com.company.lv2.day_231012;

import java.util.Stack;

// https://school.programmers.co.kr/learn/courses/30/lessons/12909
public class Q3_올바른괄호_other {

//    private static String s = "(())()";
//    private static String s = ")()(";
//    private static String s = "(()(";
    private static String s = "(()))(";

    public static void main(String[] args) {
        boolean answer = false;
        int count = 0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == '('){
                count++;
            }
            if(s.charAt(i) == ')'){
                count--;
            }
            if(count < 0){
                break;
            }
        }
        if(count == 0){
            answer = true;
        }

        System.out.println("answer = " + answer);
    }

}
