package com.company.category.greedy;

import java.util.*;

public class Cost {

    // Min Deletion Cost(Repeat Letters)
    // 'abaaab'
    // [131532]

    // 'bbbaaac'
    // [3121532]

    public static void main(String[] args) {
        String word = "abaaab";
        int[] cost = {1, 3, 1, 5, 3, 2};

        char letter = 'a';
        List<Integer> indexes = new ArrayList<>();
        for(int i=0; i<word.length(); i++) {
            char temp = word.charAt(i);

            if (letter == temp) {
                indexes.add(cost[i]);
            } else {
                letter = temp;
            }
        }

        Collections.sort(indexes);
        int sum = 0;
        for (int i=0; i<indexes.size()-1; i++) {
            sum += indexes.get(i);
        }

        System.out.println("sum = " + sum);
    }
}
