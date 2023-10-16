package com.company.lv2.day_231016;

import java.util.Stack;

// https://school.programmers.co.kr/learn/courses/30/lessons/131704
public class Q1_택배상자_wrong {

    private static int[] order = {4, 3, 1, 2, 5};

    public static void main(String[] args) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        int idx = 1;
        for (int i = 0; i < order.length; i++) {
            int deliver = order[i];
            
            if (deliver != idx) {
                stack.push(deliver);
            } else {
                idx++;
                answer++;
            }

            if (!stack.isEmpty()) {
                int check = check(stack, idx, 0);
                answer += check;
                idx = idx+check;
            }
        }

        System.out.println("answer = " + answer);
    }

    public static int check(Stack<Integer> stack, int idx, int count) {
        if (!stack.isEmpty()) {
            Integer peek = stack.peek();
            if (peek == idx) {
                stack.pop();
                return check(stack, idx+1, count+1);
            }
        }
        return count;
    }

}
