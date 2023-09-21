package com.company.lv2.day_230921;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/169199
public class Q1_리코쳇로봇 {

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

        // 1: 위, 2:오, 3:아래, 4:왼
        int answer = 0;

        ArrayList<Integer> xlist = xBlock(plate, goalX, goalY);
        ArrayList<Integer> ylist = yBlock(plate, goalX, goalY);
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(xlist);
        list.addAll(ylist);
        if (list.size() == 0 || list.size() == 4) { // 모두 뚫려있으면 바로 return
            answer = -1;
        }

        // 마지막 위치 찾기
        List<Integer> lastX = new ArrayList<>();
        List<Integer> lastY = new ArrayList<>();
        List<Character> lastDirection = new ArrayList<>();
        for (int i=0; i<list.size(); i++) {
            Integer block = list.get(i);
            int blocked = 0;

            if (block == 1) {
                for (int j=goalY+1; j<yLength; j++) {
                    blocked = findLastPoint(plate, goalX, j, 'x');
                    if (blocked != 0) {
                        lastX.add(goalX);
                        lastY.add(j);
                        lastDirection.add('y');
                    }
                }
            } else if (block == 2) {
                for (int j=goalX-1; j>=0; j--) {
                    blocked = findLastPoint(plate, j, goalY, 'y');
                    if (blocked != 0) {
                        lastX.add(j);
                        lastY.add(goalY);
                        lastDirection.add('x');
                    }
                }
            } else if (block == 3) {
                for (int j=goalY-1; j>=0; j--) {
                    blocked = findLastPoint(plate, goalX, j, 'x');
                    if (blocked != 0) {
                        lastX.add(goalX);
                        lastY.add(j);
                        lastDirection.add('y');
                    }
                }
            } else if (block == 4) {
                for (int j=goalX+1; j<xLength; j++) {
                    blocked = findLastPoint(plate, j, goalY, 'y');
                    if (blocked != 0) {
                        lastX.add(j);
                        lastY.add(goalY);
                        lastDirection.add('x');
                    }
                }
            }

            System.out.println("lastX = " + lastX);
            System.out.println("lastY = " + lastY);
            System.out.println("lastDirection = " + lastDirection);
        }


//        Collections.sort(answerList);
//        System.out.println("answer = " + answerList.get(0));
    }

    public static int findLastPoint(char[][] plate, int x ,int y, char direction) {
        int result = 0;
        ArrayList<Integer> list = new ArrayList<>();

        if (direction == 'x') {
            list.addAll(xBlock(plate, x, y));
        } else {
            list.addAll(yBlock(plate, x, y));
        }

        if (list.size() > 0) {
            result = list.get(0);
        }
        return result;
    }

    public static ArrayList<Integer> xBlock(char[][] plate, int x, int y) {
        ArrayList<Integer> list = new ArrayList<>();

        if (x == 0) { // 왼쪽
            list.add(4);
        } else if (x > 0 && plate[y][x-1] == 'D') {
            list.add(4);
        }

        if (x == xLength-1) { // 오른쪽 체크
            list.add(2);
        } else if (x < xLength-1 && plate[y][x+1] == 'D') {
            list.add(2);
        }

        return list;
    }

    public static ArrayList<Integer> yBlock(char[][] plate, int x, int y) {
        ArrayList<Integer> list = new ArrayList<>();

        if (y == 0) { // 위쪽 체크
            list.add(1);
        } else if (y > 0 && plate[y-1][x] == 'D') {
            list.add(1);
        }

        if (y == yLength-1) { // 아래쪽 체크
            list.add(3);
        } else if (y < yLength-1 && plate[y+1][x] == 'D') {
            list.add(3);
        }

        return list;
    }
}
