package com.company.category.AA;

import java.util.ArrayList;

public class Q2 {

    private static int rows = 4;
    private static int columns = 4;

    private static int[][] swipes = { // 1: 동, 2: 서, 3: 남, 4: 북
            {1, 1, 3, 4, 4},
            {3, 2, 1, 2, 4},
            {4, 2, 2, 3, 3},
            {2, 3, 2, 4, 4}
    };

    public static void main(String[] args) {
        int sum = 0;

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

            ArrayList<Integer> list = new ArrayList<>();
            if (dir == 1) { // 동
                // 마지막 번호 list에 저장
                for (int j=y1; j<=y2; j++) {
                    list.add(arr[j][x2]);

                    for (int k=x1; k<=x2-1; k++) {
                        arr[j][k+1] = arr[j][k];
                    }

                    arr[j][x1] = list.get(j-y1);
                }
            } else if (dir == 2) { // 서
                // list 세팅
            }

            else { //남, 북

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
            System.out.println();
        }

        System.out.println("sum = " + sum);
    }

}
