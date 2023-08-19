package com.company.lv1.day_230819;

public class Q3_공원산책_02 {

    // {2,1}
    //private static String[] park = {"SOO","OOO","OOO"};
    //private static String[] routes = {"E 2","S 2","W 1"};

    // {0,1}
    private static String[] park = {"SOO","OXX","OOO"};
    private static String[] routes = {"E 2","S 2","W 1"};

    // {0,0}
    //private static String[] park = {"OSO","OOO", "OXO", "OOO"};
    //private static String[] routes = {"E 2","S 3","W 1"};

    public static void main(String[] args) {
        char[][] arr = new char[park.length][park[0].length()];

        int xPo = 0; // 가로
        int yPo = 0; // 세로

        // 2차원 배열로 변환 & S 위치 찾기
        for (int i=0; i<park.length; i++) {
            arr[i] = park[i].toCharArray();
            for (int j=0; j<arr[i].length; j++) {
                if (arr[i][j] == 'S') {
                    xPo = j;
                    yPo = i;
                }
            }
        }

        for (String route : routes) {
            char[] each = route.toCharArray();

            char direction = each[0];
            int far = each[2] - '0';

            // 임시 저장
            int tempX = xPo;
            int tempY = yPo;
            boolean isBreak = false;

            for (int i=0; i<far; i++) {
                switch (direction) {
                    case 'E' : tempX++; break;
                    case 'W' : tempX--; break;
                    case 'S' : tempY++; break;
                    case 'N' : tempY--; break;
                }

                // 조건 체크
                if (tempX >= 0 && tempY >= 0 && tempX < arr[0].length && tempY < arr.length) {
                    if (arr[tempY][tempX] == 'X') {
                        isBreak = true;
                        break;
                    }
                } else {
                    isBreak = true;
                    break;
                }
            }

            if (!isBreak) {
                xPo = tempX;
                yPo = tempY;
            }
        }

        int[] answer = {yPo, xPo};
    }

}
