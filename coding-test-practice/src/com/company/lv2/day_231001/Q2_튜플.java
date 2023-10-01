package com.company.lv2.day_231001;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

// https://school.programmers.co.kr/learn/courses/30/lessons/64065
public class Q2_튜플 {

//    private static String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
//    private static String s = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
    private static String s = "{{4,2,3},{3},{2,3,4,1},{2,3}}";

    public static void main(String[] args) {
        s = s.replaceAll("\\{\\{", "");
        s = s.replaceAll("\\}\\}", "");

        String[] split = s.split("\\},\\{");
        int[] answer = new int[split.length];
        Map<Integer, Integer> map = new HashMap<>();

        for (String string : split) {
            String[] each = string.split(",");
            if (each.length == split.length) {
                for (String num : each) {
                    map.put(Integer.parseInt(num), map.getOrDefault(Integer.parseInt(num),0) + 1);
                }
                break;
            }
        }

        Comparator<String> lengthSort = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        };
        Arrays.sort(split, lengthSort);

        int idx = 0;
        for (String string : split) {
            String[] numbers = string.split(",");

            for (String number : numbers) {
                int num = Integer.parseInt(number);
                if (map.get(num) > 0) {
                    answer[idx] = num;
                    map.put(num, map.get(num)-1);
                    idx++;
                    break;
                }
            }
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}
