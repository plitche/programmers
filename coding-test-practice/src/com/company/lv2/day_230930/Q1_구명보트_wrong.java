package com.company.lv2.day_230930;

import java.util.*;

// https://school.programmers.co.kr/learn/courses/30/lessons/42885
public class Q1_구명보트_wrong {

    //private static int[] people = {70, 50, 80, 50};
    //private static int[] people = {70, 80, 50};
    private static int[] people = {70, 80, 50};
    private static int limit = 100;

    public static void main(String[] args) {
        int answer = 0;

        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int person : people) {
            list.add(person);
            map.put(person, map.getOrDefault(person, 0) + 1);
        }

        // Collections.sort(list, Collections.reverseOrder());

        while (!list.isEmpty()) {
            int left = limit - list.get(0);
            list.remove(0);

            if (left >= 40) {
                for (int j=left; j>=40; j--) {
                    Integer count = map.getOrDefault(left, 0);

                    if (count > 0) {
                        map.put(left, count-1);
                        // list.removeIf(each -> each == j);
                        list.remove(Integer.valueOf(j));
                    }
                }
            }

            answer += 1;
        }

        System.out.println("answer = " + answer);
    }

}
