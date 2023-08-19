package com.company.lv1.day_230819;

// https://school.programmers.co.kr/learn/courses/30/lessons/178871?language=java
public class Q1_달리기_경주 {

    private static String[] players = {"mumu", "soe", "poe", "kai", "mine"};
    private static String[] callings = {"kai", "kai", "mine", "mine"};

    public static void main(String[] args) {
        int playersLen = players.length;
        int callingsLen = callings.length;

        for (int i=0; i<callingsLen; i++) {
            for (int j=1; j<playersLen; j++) {
                if (check(callings[i], players[j])) {
                    String temp = players[j-1];
                    players[j-1] = players[j];
                    players[j] = temp;
                    break;
                }
            }
        }

        for (String player : players) {
            System.out.print(player + " ");
        }
    }

    public static boolean check(String target, String runner) {
        if (target.equals(runner)) {
            return true;
        }
        return false;
    }

}
