package com.company.lv1.day_230906;

import java.util.ArrayList;
import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/42862
public class Q1_체육복_answer {

//    private static int n = 5;
//    private static int[] lost = {2, 4};
//    private static Integer[] reserve = {1, 3, 5};

    private static int n = 5;
    private static int[] lost = {1, 2, 3};
    private static Integer[] reserve = {2, 3, 4};

    public static void main(String[] args) {
        int[] people = new int[n];
        int answer = n;

        for (int l : lost)
            people[l-1]--;
        for (int r : reserve)
            people[r-1]++;

        for (int i = 0; i < people.length; i++) {
            if(people[i] == -1) {
                if(i-1>=0 && people[i-1] == 1) {
                    people[i]++;
                    people[i-1]--;
                }else if(i+1< people.length && people[i+1] == 1) {
                    people[i]++;
                    people[i+1]--;
                }else
                    answer--;
            }
        }

        System.out.println("answer = " + answer);
    }

}
