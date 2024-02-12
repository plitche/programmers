package com.company.lv0.day_240212;

import java.util.Arrays;

public class Q1_X사이의개수_2 {

    private static String myString = "oxooxoxxox";
//     private static String myString = "xabcxdefxghi";

    public static void main(String[] args) {
        int[] xes = Arrays.stream(myString.split("x", myString.length()))
                .mapToInt(x -> x.length())
                .toArray();

        for (int x : xes) {
            System.out.print(x + " ");
        }
    }
}
