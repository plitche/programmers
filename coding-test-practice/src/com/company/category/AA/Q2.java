package com.company.category.AA;

import java.util.ArrayList;
import java.util.List;

public class Q2 {

    private static int rows = 4;
    private static int columns = 4;

    private static int[][] swipes = { // 1: 동, 2: 서, 3: 남, 4: 북
            {1, 2, 1, 2, 4},
            {2, 3, 2, 4, 4},
            {3, 1, 3, 4, 4},
            {4, 2, 2, 3, 3}
    };

    public static void main(String[] args) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();


        int[][] arr = new int[rows][columns];
        for (int i=1; i<=rows; i++) {
            for (int j=1; j<=columns; j++) {
                arr[i-1][j-1] = (i-1) * columns + j;
            }
        }

        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt < 10) {
                    System.out.print(anInt + "  ");
                } else {
                    System.out.print(anInt + " ");
                }
            }
            System.out.println();
        }

        for (int i=0; i<swipes.length; i++) {
            int dir = swipes[i][0];
            int y1 = swipes[i][1] -1;
            int x1 = swipes[i][2] -1;
            int y2 = swipes[i][3] -1;
            int x2 = swipes[i][4] -1;

            if (dir == 1) { // 동
                for (int j=y1; j<=y2; j++) {
                    int temp = arr[j][x2];

                    for (int k=x2-1; k>=x1; k--) {
                        arr[j][k+1] = arr[j][k];
                    }

                    arr[j][x1] = temp;
                    sum += temp;
                    list.add(temp);
                }
            } else if (dir == 2) { // 서
                for (int j=y1; j<=y2; j++) {
                    int temp = arr[j][x1];

                    for (int k=x1+1; k<=x2; k++) {
                        arr[j][k-1] = arr[j][k];
                    }

                    arr[j][x2] = temp;
                    sum += temp;
                    list.add(temp);
                }
            } else if (dir == 3){ // 남
                for (int j=x1; j<=x2; j++) {
                    int temp = arr[y2][j];

                    for (int k=y2-1; k>=y1; k--) {
                        arr[k+1][j] = arr[k][j];
                    }

                    arr[y1][j] = temp;
                    sum += temp;
                    list.add(temp);
                }
            } else if (dir == 4) { // 북
                for (int j=x1; j<=x2; j++) {
                    int temp = arr[y1][j];

                    for (int k=y1+1; k<=y2; k++) {
                        arr[k-1][j] = arr[k][j];
                    }

                    arr[y2][j] = temp;
                    sum += temp;
                    list.add(temp);
                }
            }
        }

        System.out.println("============");
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
        System.out.println("sum = " + sum);
    }

}
