package com.company.lv1.day_230902;

import java.util.ArrayList;
import java.util.Stack;

// https://school.programmers.co.kr/learn/courses/30/lessons/64061
public class Q3_크레인인형뽑기게임 {

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

        ArrayList<Stack<Integer>> list = new ArrayList<>();

        int length = board.length;
        for (int i=0; i<length; i++) {
            Stack<Integer> stack = new Stack<>();

            for (int j=length-1; j>=0; j--) {
                int num = board[j][i];
                if (num != 0) {
                    stack.push(num);
                }
            }
            list.add(stack);
            System.out.println("stack1 = " + stack);
        }

        ArrayList<Integer> popList = new ArrayList<>();
        for (int i=0; i<moves.length; i++) {
            int num = moves[i] - 1;

            Stack<Integer> stack = list.get(num);
            if (!stack.isEmpty()) {
                Integer pop = stack.pop();

                int size = popList.size();
                if (size > 0) {
                    if (popList.get(size-1) == pop) {
                        answer += 2;
                        popList.remove(size-1);
                        continue;
                    }
                }

                popList.add(pop);
            }
        }

        System.out.println("answer = " + answer);
    }

}