package com.company.lv1.day_230902;

import java.util.ArrayList;
import java.util.Stack;

// https://school.programmers.co.kr/learn/courses/30/lessons/64061
public class Q3_크레인인형뽑기게임_answer {

    private static int[][] board = {
            {0, 0, 0, 0, 0},
            {0, 0, 1, 0, 3},
            {0, 2, 5, 0, 1},
            {4, 2, 4, 4, 2},
            {3, 5, 1, 3, 1}
    };
    private static int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

//    private static int[][] board = {
//            {1, 1, 1, 1, 1},
//            {1, 1, 1, 1, 1},
//            {1, 1, 1, 1, 1},
//            {1, 1, 1, 1, 1},
//            {1, 1, 1, 1, 1}
//    };
//    private static int[] moves = {1,1,1,1,1,2,2,2,2,2,3,3,3,3,3,4,4,4,4,4,5,5,5,5,5};

//    private static int[][] board = {
//            {0, 0, 0, 0, 0},
//            {0, 0, 1, 0, 3},
//            {0, 2, 5, 0, 1},
//            {4, 2, 4, 4, 2},
//            {3, 5, 1, 3, 1}
//    };
//    private static int[] moves = {1, 1, 2, 2,2 , 3, 3,3 ,3, 4 ,4, 5, 5, 5,5};

    public static void main(String[] args) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        for (int move : moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][move - 1] != 0) {
                    if (stack.isEmpty()) {
                        stack.push(board[j][move - 1]);
                        board[j][move - 1] = 0;
                        break;
                    }
                    if (board[j][move - 1] == stack.peek()) {
                        stack.pop();
                        answer += 2;
                    } else
                        stack.push(board[j][move - 1]);
                    board[j][move - 1] = 0;
                    break;
                }
            }
        }

        System.out.println("answer = " + answer);
    }

}