package com.company.lv2.day_230923;

import java.util.HashMap;

// https://school.programmers.co.kr/learn/courses/30/lessons/131127
public class Q3_할인행사 {

    private static String[] want = {"banana", "apple", "rice", "pork", "pot"};
    private static int[] number = {3, 2, 2, 2, 1};
    private static String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};

    public static void main(String[] args) {
        int answer = 0;

        HashMap<String, Integer> map = new HashMap<>();
        for (int i=0; i<want.length; i++) {
            map.put(want[i], number[i]);
        }

        for (int i=0; i<=discount.length-10; i++) {
            HashMap<String, Integer> tempMap = (HashMap<String, Integer>) map.clone();
            boolean result = true;

            for (int j=i; j<i+10; j++) {
                String discountProduct = discount[j];
                if (tempMap.containsKey(discountProduct)) {
                    tempMap.put(discountProduct, tempMap.get(discountProduct)-1);
                }
            }
            for (String s : tempMap.keySet()) {
                Integer temp = tempMap.get(s);
                if (temp > 0) {
                    result = false;
                    break;
                }
            }
            System.out.println("result = " + result);
            if (result) answer+=1;
        }

        System.out.println("answer = " + answer);
    }

}