package com.company.lv1.day_230828;


import java.util.Arrays;
import java.util.HashMap;

// https://school.programmers.co.kr/learn/courses/30/lessons/131705
public class Q1_삼총사_02_fail {
    private static int[] number = {-2, 3, 0, 2, -5};
    // private static int[] number = {-3, -2, -1, 0, 1, 2, 3};

    public static void main(String[] args) {
        int answer = 0;

        Arrays.sort(number);

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<number.length; i++) {
            Integer value = map.getOrDefault(number[i], 0);
            map.put(number[i], value+1);
        }

        System.out.println("map = " + map);

        for (int i=0; i<number.length; i++) {
            int num1 = number[i];
            map.put(num1, map.get(num1)-1);

            for (int j=i+1; j<number.length; j++) {
                int num2 = number[j];
                int left = 0 - (num1 + num2);

                map.put(num2, map.get(num2)-1);

                Integer value = map.getOrDefault(left, 0);

                System.out.println("num1 = " + num1 + " : " + num2);
                System.out.println("left = " + left);
                System.out.println("value = " + value);
                if(value > 0) {
                    answer += map.get(left);
                }

                map.put(num2, map.get(num2)+1);
            }
            map.put(num1, map.get(num1)+1);

        }

        System.out.println("answer = " + answer);
    }

}
