package com.company.lv1.day_230819;

import java.util.ArrayList;
import java.util.HashMap;

public class Q3_공원산책_01 {

    private static String[] park = {"SOO","OOO","OOO"};
    private static String[] routes = {"E 2","S 2","W 1"};

    //private static String[] park = {"SOO","OXX","OOO"};
    //private static String[] routes = {"E 2","S 2","W 1"};

    //private static String[] park = {"OSO","OOO", "OXO", "OOO"};
    //private static String[] routes = {"E 2","S 3","W 1"};

    public static void main(String[] args) {
        int[] answer = new int[2];

        // 초기화(거리)
        ArrayList<HashMap<String, Integer>> routeList = new ArrayList<>();
        for (int i=0; i<routes.length; i++) {
            String[] split = routes[i].split(" ");

            HashMap<String, Integer> map = new HashMap<>();
            int far = Integer.parseInt(split[1]);
            switch (split[0]) {
                case "E" : map.put("X", far); break;
                case "W" : map.put("X", far - far*2); break;
                case "S" : map.put("Y", far); break;
                case "N" : map.put("Y", far - far*2); break;
            }

            routeList.add(map);
        }

        // 강아지 현재 위치 & 2차원 배열로 변경
        String[][] arr = new String[park.length][park[0].length()];
        int startX = 0;
        int startY = 0;
        for (int i=0; i< park.length; i++) {
            String[] split = park[i].split("");

            for (int j=0; j<split.length; j++) {
                arr[i][j] = split[j];
                if (split[j].equals("S")) {
                    startX = j;
                    startY = i;
                }
            }
        }

        // 위치 찾기
        for (int i=0; i<routeList.size(); i++) {
            HashMap<String, Integer> map = routeList.get(i);

            if (map.containsKey("X")) { // 가로
                Integer x = map.get("X");
                boolean isBreak = false; // 장애물 여부

                if (x > 0) {
                    if (startX+x > arr[0].length-1) {
                        isBreak = true;
                    } else {
                        for (int j=startX; j<startX+x; j++) {
                            if (arr[startY][j].equals("X")) {
                                isBreak = true;
                                break;
                            }
                        }
                    }
                } else {
                    if (startX-x < 0) {
                        isBreak = true;
                    } else {
                        for (int j=startX-x; j<startX; j++) {
                            if (arr[startY][j].equals("X")) { // 장애물
                                isBreak = true;
                                break;
                            }
                        }
                    }
                }
                startX = isBreak ? startX : startX+x;
            } else { // 세로
                Integer y = map.get("Y");
                boolean isBreak = false; // 장애물 여부

                if (y > 0) {
                    if (startY+y > arr.length-1) {
                        isBreak = true;
                    } else {
                        for (int j=startY; j<startY+y; j++) {
                            if (arr[j][startX].equals("X")) {
                                isBreak = true;
                                break;
                            }
                        }
                    }
                } else {
                    if (startY-y < 0) {
                        isBreak = true;
                    } else {
                        for (int j=startY-y; j<startY; j++) {
                            if (arr[j][startX].equals("X")) {
                                isBreak = true;
                                break;
                            }
                        }
                    }
                }
                startY = isBreak ? startY : startY+y;
            }
        }

        answer[0] = startY;
        answer[1] = startX;

        System.out.println("answer = " + answer[0]);
        System.out.println("answer = " + answer[1]);
    }
}
