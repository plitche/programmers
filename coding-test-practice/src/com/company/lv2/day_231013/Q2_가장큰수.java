package com.company.lv2.day_231013;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

// https://school.programmers.co.kr/learn/courses/30/lessons/42746
public class Q2_가장큰수 {

    // private static int[] numbers = {6, 10, 2};
    // private static int[] numbers = {3, 30, 34, 5, 9};
    private static int[] numbers = {0, 0};

    public static void main(String[] args) {
        String[] arr = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
        Comparator<String> sort = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2){
                String result1 = s1 + s2;
                String result2 = s2 + s1;
                return result2.compareTo(result1);
            }
        };
        Arrays.sort(arr, sort);
        String collect = Arrays.stream(arr).collect(Collectors.joining(""));

        int count = 0;
        for (int i=0; i<collect.length(); i++) if (collect.charAt(i) == '0') count++;
        System.out.println("answer = " + (count == collect.length() ? "0" : collect));
    }

}
