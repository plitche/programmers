package com.company.lv2.day_231013;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

// https://school.programmers.co.kr/learn/courses/30/lessons/42746
public class Q2_가장큰수_wrong {

    // private static int[] numbers = {6, 10, 2};
    private static int[] numbers = {3, 30, 34, 5, 9};

    public static void main(String[] args) {
        String[] arr = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
        Comparator<String> sort = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2){
                char c1 = s1.charAt(0);
                char c2 = s2.charAt(0);

                if (c1 == c2) {
                    if (s1.length() == s2.length()) return s1.compareTo(s2);
                    else if (s1.length() > s2.length()) return Integer.compare(s1.charAt(1), c2);
                    else return Integer.compare(s2.charAt(1), c1);
                } else return Integer.compare(c2, c1);
            }
        };
        Arrays.sort(arr, sort);
        String collect = Arrays.stream(arr).collect(Collectors.joining(""));
        System.out.println("answer = " + collect);
    }

}
