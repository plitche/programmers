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

class CostSolution {
    public static void main(String[] args) {
        String word = "bbbaaac";
        int[] cost = {3, 1, 2, 5, 3, 2, 1};

        int sum = 0;
        if (cost.length <= 1) {
            System.out.println(sum);
            return;
        }

        String letter = "";
        int max_cost = 0;
        for (int i=0; i<cost.length; i++) {
            String temp_letter = String.valueOf(word.charAt(i));
            int temp_cost = cost[i];

            if (!letter.equals(temp_letter)) {
                letter = temp_letter;
                max_cost = temp_cost;
            } else {
                if (max_cost > temp_cost) {
                    sum += temp_cost;
                } else {
                    sum += max_cost;
                    max_cost = temp_cost;
                }
            }
        }

        System.out.println(sum);
    }
}
