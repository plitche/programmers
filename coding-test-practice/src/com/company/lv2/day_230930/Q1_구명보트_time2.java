package com.company.lv2.day_230930;

import java.util.*;

// https://school.programmers.co.kr/learn/courses/30/lessons/42885
public class Q1_구명보트_time2 {

    private static int[] people = {70, 50, 80, 50};
    //private static int[] people = {70, 80, 50};
//    private static int[] people = {70, 50, 80, 50, 90, 40};
//    private static int[] people = {30, 40, 60, 70};
    private static int limit = 100;

    public static void main(String[] args) {
        int answer = 0;

        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int person : people) {
            list.add(person);
            map.put(person, map.getOrDefault(person, 0) + 1);
        }

        Collections.sort(list, Collections.reverseOrder());

        while (!list.isEmpty()) {
            System.out.println("map = " + map);
            int person = list.get(0);
            int left = limit - person;
            list.remove(0);
            map.put(person, map.get(person)-1);

            for (int j=list.size()-1; j>=0; j--) {
                Integer weight = list.get(j);

                if (weight > left) {
                    continue;
                }

                Integer count = map.getOrDefault(weight, 0);
                if (count > 0) {
                    map.put(weight, count-1);
                    list.remove(Integer.valueOf(weight));
                    break;
                }
            }

            answer += 1;
        }

        System.out.println("answer = " + answer);
    }

}
