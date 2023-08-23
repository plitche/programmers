package com.company.lv1.day_230823;

import java.util.ArrayList;
import java.util.Arrays;

public class Q1_명예의전당1 {

    private static int k = 3;
    private static int[] score = {10, 100, 20, 150, 1, 100, 200};

    public static void main(String[] args) {
        int[] answer = new int[score.length];

        int[] arr = new int[k];

        for (int i=0; i<k; i++) {
            arr[i] = -1;
        }

        for (int i=0; i<score.length; i++) {
            int temp = score[i];
            for (int j=0; j<arr.length; j++) {
                if (arr[j] == -1) {
                    arr[j] = temp;
                    break;
                } else if (arr[j] < temp) {
                    arr[j] = temp;
                    break;
                }
            }

            Arrays.sort(arr);

            for (int j=0; j<arr.length; j++) {
                if (arr[j] >= 0) {
                    int min = arr[j];
                    answer[i] = min;
                    break;
                }
            }
        }

        System.out.println();
        for (int i : answer) {
            System.out.print(i + " ");
        }

    }

}
