package com.company.lv1.day_230906;

import java.util.Arrays;
import java.util.stream.Collectors;

// https://school.programmers.co.kr/learn/courses/30/lessons/42748
public class Q2_K번째수_wrong {

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

        String str = Arrays.stream(array).mapToObj(Integer::toString).collect((Collectors.joining(",")));

        for (int i=0; i<commands.length; i++) {
            int start = commands[i][0]-1;
            int end = commands[i][1] == start+1 ? commands[i][1] : commands[i][1]+1;
            int target = commands[i][2]-1;

            String temp = "";
            if (end+1 > str.length()) {
                temp = str.substring(start);
            } else {
                temp = str.substring(start, end);
            }

            char[] chars = temp.toCharArray();
            Arrays.sort(chars);
            char aChar = chars[target];
            answer[i] = aChar - '0';
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }

}
