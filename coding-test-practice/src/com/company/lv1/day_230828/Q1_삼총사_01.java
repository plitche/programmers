package com.company.lv1.day_230828;


// https://school.programmers.co.kr/learn/courses/30/lessons/131705
public class Q1_삼총사_01 {
    private static int[] number = {-2, 3, 0, 2, -5};
    // private static int[] number = {-3, -2, -1, 0, 1, 2, 3};

    public static void main(String[] args) {
        int answer = 0;

        for (int i=0; i<number.length; i++) {
            for (int j=i+1; j<number.length; j++) {
                int left = 0 - (number[i] + number[j]);

                for (int k=j+1; k<number.length; k++) {
                    if (number[k] == left) {
                        answer++;
                    }
                }
            }
        }

        System.out.println("answer = " + answer);
    }

}
