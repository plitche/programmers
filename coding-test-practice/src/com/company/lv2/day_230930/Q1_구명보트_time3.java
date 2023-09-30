package com.company.lv2.day_230930;

import java.util.*;

// https://school.programmers.co.kr/learn/courses/30/lessons/42885
public class Q1_구명보트_time3 {

//    private static int[] people = {70, 50, 80, 50};
//    private static int[] people = {70, 80, 50};
//    private static int[] people = {70, 50, 80, 50, 90, 40};
    private static int[] people = {30, 40, 60, 70};
    private static int limit = 100;

    public static void main(String[] args) {
        int answer = 0;

        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int person : people) {
            list.add(person);
            map.put(person, map.getOrDefault(person, 0) + 1);
        }

        Collections.sort(list);

        int left = 0;
        int right = list.size()-1;

        while(left<=right) {
            Integer leftNum = list.get(left);
            Integer rightNum = list.get(right);

            System.out.println("idx = " + left + " : " + right);
            System.out.println("leftNum = " + leftNum + " : " + rightNum);

            if (limit >= leftNum + rightNum) {
                left += 1;
            }

            right -= 1;
            answer += 1;
        }

        System.out.println("answer = " + answer);
    }

}
