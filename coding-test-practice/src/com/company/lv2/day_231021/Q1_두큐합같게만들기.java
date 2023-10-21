package com.company.lv2.day_231021;

import java.util.LinkedList;
import java.util.Queue;

// https://school.programmers.co.kr/learn/courses/30/lessons/118667
public class Q1_두큐합같게만들기 {

    static long sum = 0;

//    private static int[] queue1 = {3, 2, 7, 2};
//    private static int[] queue2 = {4, 6, 5, 1};

//    private static int[] queue1 = {1, 2, 1, 2};
//    private static int[] queue2 = {1, 10, 1, 2};

    private static int[] queue1 = {1, 4};
    private static int[] queue2 = {4, 8};

    public static void main(String[] args) {
        int answer = 0;

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        long a = 0;
        long b = 0;
        for (int i : queue1) {
            q1.offer(i);
            sum += i;
            a += i;
        }

        for (int i : queue2) {
            q2.offer(i);
            sum += i;
            b += i;
        }

        if (sum%2 != 0) {
            answer = -1;
        } else {
            sum /= 2;
            int length = q1.size();

            while(true) {
                if (a == b && a == sum) {
                    break;
                }

                int poll = 0;
                if (a > b) {
                    poll = q1.poll();
                    a -= poll;
                    q2.offer(poll);
                    b += poll;
                } else {
                    poll = q2.poll();
                    b -= poll;
                    q1.offer(poll);
                    a += poll;
                }

                if (q1.isEmpty() || q2.isEmpty() || length <= 0) {
                    answer = -1;
                    break;
                }

                answer++;
                length--;
            }
        }


        System.out.println("answer = " + answer);
    }

}
