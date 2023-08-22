package com.company.category.AA;

import java.util.HashMap;
import java.util.Map;

public class Q3 {

    private static String[] replies = {"AFFDEFDEFDEEC", "AAAAAA", "ABCDE"};
    private static int n = 3;
    private static int k = 3;

    public static void main(String[] args) {
        int[] answer = new int[replies.length];

        for (int i=0; i<replies.length; i++) {
            HashMap<String, Integer> map = new HashMap<>();

            for (int j=0; j<=replies[i].length()-n; j++) {
                String temp = replies[i].substring(i, i+n);

                if (map.containsKey(temp)) {
                    Integer count = map.get(temp);

                    if (count >= k) {
                        answer[i] = 1;
                        break;
                    } else {
                        map.put(temp, map.get(temp)+1);
                    }
                } else {
                    map.put(temp, 1);
                }
            }
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}
