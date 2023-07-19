package com.company.category.greedy;

import java.util.*;

public class Cost {

    // Min Deletion Cost(Repeat Letters)
    // 'abaaab'
    // [131532]

    // 'bbbaaac'
    // [3121532]

    public static void main(String[] args) {
        String word = "bbbaaac";
        int[] cost = {3, 1, 2, 5, 3, 2, 1};
        int sum = 0;

        char letter = word.charAt(0);
        List<Integer> counts = new ArrayList<>();
        int count = 1;

        List<Integer> indexes = new ArrayList<>();
        for(int i=1; i<word.length(); i++) {
            char temp = word.charAt(i);

            if (letter == temp) {
                if (i == 1  || count == 1) {
                    indexes.add(cost[i-1]);
                }

                indexes.add(cost[i]);
                count++;
            } else {
                letter = temp;

                if (count > 1) {
                    counts.add(count);
                }
                count = 1;
            }
        }

        List<Integer> tempList = new ArrayList<>();
        int before = 0;
        int after = 0;
        for (int i=0; i<counts.size(); i++) {
            if (i>0) {
                before += counts.get(i-1);
            }
            after += counts.get(i);

            for (int j=before; j<after; j++) {
                tempList.add(indexes.get(j));
            }

            Collections.sort(tempList);
            for (int j=0; j<tempList.size()-1; j++) {
                sum += tempList.get(j);
            }

            tempList = new ArrayList<>();
        }



        System.out.println("sum = " + sum);
    }
}
