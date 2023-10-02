package com.company.lv2.day_231002;

// https://school.programmers.co.kr/learn/courses/30/lessons/42842
public class Q1_카펫 {

//    private static int brown = 10;
//    private static int yellow = 2;

//    private static int brown = 8;
//    private static int yellow = 1;

    private static int brown = 24;
    private static int yellow = 24;

    public static void main(String[] args) {
        int[] answer = new int[2];

        int total = brown + yellow;

        boolean isStop = false;
        for (int i=1; i<=yellow; i++) {
            for (int j=1; j<=yellow; j++) {
                if (i*j == yellow) {
                    if ((i+2) * (j+2) == total) {
                        answer[0] = j+2;
                        answer[1] = i+2;
                        isStop = true;
                        break;
                    }
                }
            }

            if (isStop) break;
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }

}
