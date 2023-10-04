package com.company.lv2.day_231004;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// https://school.programmers.co.kr/learn/courses/30/lessons/42586https://school.programmers.co.kr/learn/courses/30/lessons/42586
public class Q1_기능개발 {

    private static int[] progresses = {93, 30, 55};
    private static int[] speeds = {1, 30, 5};

//    private static int[] progresses = {95, 90, 99, 99, 80, 99};
//    private static int[] speeds = {1, 1,1 ,1 ,1 ,1, 1};

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Queue<Integer> queue = new LinkedList<>();
        for (int i=0; i<progresses.length; i++) {
            queue.offer((int) Math.ceil((double)(100-progresses[i])/speeds[i]));
        }

        int count = 1;
        int took = queue.poll();
        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            if (took >= poll) {
                count++;
            } else {
                list.add(count);
                count = 1;
                took = poll;
            }
        }

        if (count != 0) {
            list.add(count);
        }

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        for (int i : answer) {
            System.out.print(i + " ");
        }
    }

}
