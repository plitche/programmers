package com.company.lv2.day_231005;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// https://school.programmers.co.kr/learn/courses/30/lessons/42578
public class Q1_의상 {

    private static String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
    public static void main(String[] args) {
        Map<String, Integer> map = getClothesPartCountMap(clothes);
        // 모든 부위를 착용 안하는 경우의 수 - 1
        System.out.println(getAnswer(map) -1);
    }

    private static int getAnswer(Map<String, Integer> map) {
        int answer = 1;
        for (String s : map.keySet()) {
            // 착용안하는 경우의 수 = +1
            answer *= (map.get(s)+1);
        }
        return answer;
    }

    private static Map<String, Integer> getClothesPartCountMap(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        for (String[] clothe : clothes) {
            if (map.containsKey(clothe[1])) {
                map.put(clothe[1], map.get(clothe[1]) + 1);
                continue;
            }
            map.put(clothe[1], 1);
        }
        return map;
    }
}
