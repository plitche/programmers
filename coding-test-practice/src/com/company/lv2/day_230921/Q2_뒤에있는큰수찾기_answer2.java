package com.company.lv2.day_230921;

import java.util.Stack;

// https://school.programmers.co.kr/learn/courses/30/lessons/154539
public class Q2_뒤에있는큰수찾기_answer2 {

    //private static int[] numbers = {2, 3, 3, 5};
    private static int[] numbers = {9, 1, 5, 3, 6, 2};

    public static void main(String[] args) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < numbers.length; i++) {
            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                answer[stack.pop()] = numbers[i];
            }
            stack.add(i);
        }

        for (int i = 0 ; i < answer.length ; i++) {
            if (answer[i] == 0) {
                answer[i] = -1;
            }
        }
        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }

}
