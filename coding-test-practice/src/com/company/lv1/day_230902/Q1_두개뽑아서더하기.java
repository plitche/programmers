package com.company.lv1.day_230902;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// https://school.programmers.co.kr/learn/courses/30/lessons/68644
public class Q1_두개뽑아서더하기 {

    //private static int[] numbers = {2,1,3,4,1};
    private static int[] numbers = {0, 5, 2, 7};

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        for (int i=0; i<numbers.length; i++) {
            for (int j=i+1; j< numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }


        int[] answer = new int[set.size()];
        Iterator<Integer> iterator = set.iterator();
        int idx = 0;
        while(iterator.hasNext()) {
            answer[idx] = iterator.next();
            idx+=1;
        }
        Arrays.sort(answer);

        for (int i : answer) {
            System.out.print(i + " ");
        }

    }
}
