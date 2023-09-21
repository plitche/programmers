package com.company.lv2.day_230921;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/169199
public class Q1_리코쳇로봇_during {

    private static String[] board = {"...D..R", ".D.G...", "....D.D", "D....D.", "..D...."};
    //private static String[] board = {".D.R", "....", ".G..", "...D"};


    static int xLength = board[0].length();
    static int yLength = board.length;

    public static void main(String[] args) {
        ArrayList<Integer> answerList = new ArrayList<>();

        int robotX = 0;
        int robotY = 0;

        int goalX = 0;
        int goalY = 0;

        char[][] plate = new char[yLength][xLength];

        for (int i=0; i<board.length; i++) {
            String each = board[i];

            char[] chars = each.toCharArray();
            plate[i] = chars;

            if (each.contains("R")) {
                robotX = each.indexOf("R");
                robotY = i;
            }

            if (each.contains("G")) {
                goalX = each.indexOf("G");
                goalY = i;
            }
        }

        int[] xArr = {0, 0, -1, +1};
        int[] yArr = {-1, +1, 0, 0};



//        Collections.sort(answerList);
//        System.out.println("answer = " + answerList.get(0));
    }

}
