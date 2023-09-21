package com.company.lv2.day_230920;

// https://school.programmers.co.kr/learn/courses/30/lessons/172927
public class Q1_광물캐기 {

    private static int[] picks = {1, 3, 2};
    private static String[] minerals = {"diamond", "diamond", "diamond", "iron", "iron", "diamond", "iron", "stone"};

    public static void main(String[] args) {
        int answer = 0;

        int diaPick = 25 * 5;
        int ironPick = 5 * 5;
        int stonePick = 1 * 5;

        int sum = 0;
        for (int i=0; i<minerals.length; i++) {
            String mineral = minerals[i];
            if (mineral.equals("diamond")) {
                sum += 25;
            } else if (mineral.equals("iron")) {
                sum += 5;
            } else {
                sum += 1;
            }
        }
    }
}
