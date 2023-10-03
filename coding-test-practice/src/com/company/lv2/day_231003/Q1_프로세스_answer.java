package com.company.lv2.day_231003;

import java.util.*;
import java.util.stream.Collectors;

// https://school.programmers.co.kr/learn/courses/30/lessons/42587
public class Q1_프로세스_answer {

//    private static int[] priorities = {2, 1, 3, 2};
//    private static int location = 2;
//    private static int location = 1;

    private static int[] priorities = {1, 1, 9, 1, 1, 1};
    private static int location = 0;

    public static void main(String[] args) {
        int answer = 0;

        Queue<Integer> que = new LinkedList<>();
        for(int i : priorities) que.add(i);

        Arrays.sort(priorities);
        int size = priorities.length-1;

        while(!que.isEmpty()) {
            Integer i = que.poll();
            if (i == priorities[size - answer]) {
                answer++;
                location--;
                if(location < 0) break;
            } else {
                que.add(i);
                location--;
                if(location < 0) location = que.size()-1;
            }
        }
        
        System.out.println("answer = " + answer);
    }

}