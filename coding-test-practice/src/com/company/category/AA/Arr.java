package com.company.category.AA;

public class Arr {

    // int[][] arr = new int[세로길이][가로길이];

    public static void main(String[] args) {
        // n * m = 3 * 6
        int n = 3; // 세로길이
        int m = 6; // 가로길이

        int[][] arr = new int[n][m];
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        System.out.println();

        int[][] arr2 = {
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };
        System.out.println("세로길이 : " + arr2.length);
        System.out.println("가로길이 : " + arr2[0].length);
    }

}
