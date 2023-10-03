package com.company.lv2.day_231003;

import java.util.*;
import java.util.stream.Collectors;

// https://school.programmers.co.kr/learn/courses/30/lessons/42587
public class Q1_프로세스 {

//    private static int[] priorities = {2, 1, 3, 2};
//    private static int location = 2;
//    private static int location = 1;

    private static int[] priorities = {1, 1, 9, 1, 1, 1};
    private static int location = 0;

    public static void main(String[] args) {
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int priority : priorities) {
            queue.offer(priority);
            set.add(priority);
            map.put(priority, map.getOrDefault(priority, 0)+1);
        }

        List<Integer> collect = set.stream().sorted().collect(Collectors.toList());

        while(!queue.isEmpty()) {
            Integer peek = queue.peek();
            if (peek != collect.get(collect.size()-1)) {
                Integer poll = queue.poll();
                queue.offer(poll);

                if (location == 0) {
                    location = queue.size()-1;
                } else {
                    location -= 1;
                }
            } else {
                answer += 1;
                Integer poll = queue.poll();

                if (map.get(poll) == 1) {
                    collect.remove(poll);
                }
                map.put(poll, map.get(poll)-1);

                if (location == 0) {
                    break;
                } else {
                    location -= 1;
                }
            }
        }

        System.out.println("answer = " + answer);
    }

}