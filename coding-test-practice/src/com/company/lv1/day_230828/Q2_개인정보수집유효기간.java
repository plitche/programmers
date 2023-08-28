package com.company.lv1.day_230828;

import java.util.ArrayList;
import java.util.HashMap;

// https://school.programmers.co.kr/learn/courses/30/lessons/150370
public class Q2_개인정보수집유효기간 {

    private static String today = "2022.05.19";
    private static String[] terms = {"A 6", "B 12", "C 3"};
    private static String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

    public static void main(String[] args) {
        ArrayList<Integer> answer = new ArrayList<>();

        String[] nowDate = today.split("[.]");
        int y = Integer.parseInt(nowDate[0]);
        int m = Integer.parseInt(nowDate[1]);
        int d = Integer.parseInt(nowDate[2]);

        int nowDays = (y-1)*12*28 + (m-1)*28 + d;

        HashMap<String, Integer> termMap = new HashMap<>();
        for (int i=0; i<terms.length; i++) {
            String[] split = terms[i].split(" ");
            termMap.put(split[0], Integer.parseInt(split[1])*28);
        }

        for (int i=0; i<privacies.length; i++) {
            String[] s = privacies[i].split(" ");
            String[] saveDate = s[0].split("[.]");
            String term = s[1];

            int saveY = Integer.parseInt(saveDate[0]);
            int saveM = Integer.parseInt(saveDate[1]);
            int saveD = Integer.parseInt(saveDate[2]);
            int saveDays = (saveY-1)*12*28 + (saveM-1)*28 + saveD;

            int gap = nowDays - saveDays;

            Integer value = termMap.get(term);

            if (value <= gap) {
                answer.add(i+1);
            }
        }

        int[] arr = answer.stream().mapToInt(Integer::intValue).toArray();

        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }

    }
}
