package com.company.lv2.day_231003;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// https://school.programmers.co.kr/learn/courses/30/lessons/42587
public class Q1_프로세스_wrong {

    private static int[] priorities = {2, 1, 3, 2};
//    private static int location = 2;
    private static int location = 1;

//    private static int[] priorities = {1, 1, 9, 1, 1, 1};
//    private static int location = 0;


    public static void main(String[] args) {
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        for (int priority : priorities) {
            queue.offer(priority);
            set.add(priority);
        }

        List<Integer> collect = set.stream().sorted().collect(Collectors.toList());

        int idx = 0;
        while(!queue.isEmpty()) {
            System.out.println("collect = " + collect);

            Integer peek = queue.peek();
            if (peek != collect.get(collect.size()-1)) {
                Integer poll = queue.poll();
                queue.offer(poll);

                if (idx == location) {
                    idx = queue.size()-1;
                } else {
                    idx += 1;
                }
            } else {
                answer += 1;
                Integer poll = queue.poll();
                collect.remove(poll);
                if (idx == location) {
                    break;
                } else {
                    idx -= 1;
                }
            }
        }

        System.out.println("answer = " + answer);
    }

}