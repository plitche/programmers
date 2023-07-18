package com.company.category.greedy;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;

public class Truck {
    // Maximum Units on a Truck

    // 하나의 트럭에 최대한 많은 개수의 물건을 실어야 한다.
    // 트럭에는 k개의 박스만 실을 수 있다.
    // 문제에는 몇개의 박스가 주어진다. 각 박스당 물건의 개수가 다르다.

    public static void main(String[] args) {
        int k = 5;
        int[][] containers = {
                {3, 1},
                {2, 2},
                {1, 4},
                {2, 3}
        };
/*
        for (int[] i : containers) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
*/
        Long start = System.currentTimeMillis();

        int count = 0;
        int max = 0;
        for (int i=0; i<containers.length; i++) {
            int temp = containers[i][1];
            if (temp > max) {
                max = temp;
            }
        }

        while(k > 0) {
            for (int i=0; i<containers.length; i++) {
                int box = containers[i][0];
                int item = containers[i][1];

                if (item == max) {
                    if (box >= k) {
                        count += k*item;
                        k = 0;
                        break;
                    } else {
                        count += box*item;
                        k -= box;
                        max--;
                    }
                } else {
                    continue;
                }
            }
        }

        Long end = System.currentTimeMillis();
        System.out.println("count = " + count);
        System.out.println("time = " + (start-end));
    }

}
class solution {
    public static void main(String[] args) {
        int k = 4;
        int[][] containers = {
                {3, 1},
                {2, 2},
                {1, 4},
                {2, 3}
        };
        Long start = System.currentTimeMillis();

        Arrays.sort(containers, (a, b) -> {
            return b[1] - a[1];
        });

        // Arrays.sort(containers, Comparator.comparingInt(o2 -> o2[1]));

        int total_unit = 0;
        int length = containers.length;

        for (int i=0; i<length; i++) {
            if (k <= containers[i][0]) {
                total_unit += k*containers[i][1];
                break;
            } else {
                total_unit += containers[i][0]*containers[i][1];
                k -= containers[i][0];
            }
        }
        Long end = System.currentTimeMillis();
        System.out.println(total_unit);
        System.out.println("time = " + (start-end));

    }
}