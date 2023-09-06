package com.company.lv1.day_230906;

import java.util.Arrays;
import java.util.stream.Collectors;

// https://school.programmers.co.kr/learn/courses/30/lessons/42748
public class Q2_K번째수 {

//    private static int[] array = {1, 5, 2, 6, 3, 7, 4};
//    private static int[][] commands = {
//            {2, 5, 3},
//            {4, 4, 1},
//            {1, 7, 3}
//    };

    private static int[] array = {10, 2};
    private static int[][] commands = {
            {1, 2, 1},
    };
    public static void main(String[] args) {
        int[] answer = new int[commands.length];

        for (int i=0; i<commands.length; i++) {
            int start = commands[i][0]-1;
            int end = commands[i][1];
            int target = commands[i][2]-1;

            int[] tempArr = new int[end - start];
            int idx = 0;
            for (int j=start; j<end; j++) {
                tempArr[idx] = array[j];;
                idx += 1;
            }

            Arrays.sort(tempArr);

            answer[i] = tempArr[target];
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }

}
