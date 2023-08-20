package com.company.lv1.day_230820;

import java.util.LinkedList;
import java.util.Queue;

//https://school.programmers.co.kr/learn/courses/30/lessons/159994
public class Q4_카드뭉치_queue {

    //private static String[] cards1 = {"i", "drink", "water"};
    private static String[] cards1 = {"i", "water", "drink"};
    private static String[] cards2 = {"want", "to"};
    private static String[] goal = {"i", "want", "to", "drink", "water"};

    public static void main(String[] args) {
        String answer = "";

        Queue<String> qGoal = new LinkedList<>();
        Queue<String> qCard1 = new LinkedList<>();
        Queue<String> qCard2 = new LinkedList<>();

        for(String str : goal) {
            qGoal.offer(str);
        }

        for(String card : cards1) {
            qCard1.offer(card);
        }

        for(String card : cards2) {
            qCard2.offer(card);
        }

        while(!qGoal.isEmpty()) {
            String str = qGoal.poll();

            if(str.equals(qCard1.peek())) qCard1.poll();
            else if(str.equals(qCard2.peek())) qCard2.poll();
            else answer = "No";
        }

        answer =  "Yes";
        System.out.println("answer = " + answer);
    }
}
