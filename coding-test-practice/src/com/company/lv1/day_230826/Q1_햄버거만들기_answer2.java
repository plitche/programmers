package com.company.lv1.day_230826;

import java.util.Stack;

// https://school.programmers.co.kr/learn/courses/30/lessons/133502
public class Q1_햄버거만들기_answer2 {

    private static int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};

    public static void main(String[] args) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        for (int ing : ingredient) {
            stack.push(ing);
            if (ing == 1 && tryBurger(stack)) {
                answer++;
            }
        }

        System.out.println("answer = " + answer);
    }

    public static boolean tryBurger(Stack<Integer> stack) {
        if (stack.size() < 4) {
            return false;
        }

        Stack<Integer> tempStack = new Stack<>();
        Integer[] recipe = new Integer[]{1, 3, 2, 1}; // reverse order 빵 고기 야채 빵

        for (Integer ing : recipe) {
            Integer thisIng = stack.pop();
            if (thisIng == ing) {
                tempStack.push(thisIng);
            } else {
                stack.push(thisIng);
                break;
            }
        }

        if (tempStack.size() == 4) {
            return true;
        } else {
            while (!tempStack.isEmpty()) {
                stack.push(tempStack.pop());
            }
            return false;
        }
    }
}
