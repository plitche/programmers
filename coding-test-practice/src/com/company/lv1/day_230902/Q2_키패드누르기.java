package com.company.lv1.day_230902;

import java.util.ArrayList;
import java.util.Locale;

// https://school.programmers.co.kr/learn/courses/30/lessons/67256
public class Q2_키패드누르기 {

//    private static int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
//    private static String hand = "right";

//    private static int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
//    private static String hand = "left";

    private static int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    private static String hand = "right";

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        hand = hand.toUpperCase(Locale.ROOT).substring(0, 1);
        String l = "147";
        String r = "369";

        boolean lCenter = false;
        int ly = 4;
        boolean rCenter = false;
        int ry = 4;

        for (int i=0; i<numbers.length; i++) {
            int number = numbers[i];
            int yPosition = findY(number);

            if (l.contains(String.valueOf(number))) {
                ly = yPosition;
                lCenter = false;
                sb.append("L");
            } else if (r.contains(String.valueOf(number))) {
                ry = yPosition;
                rCenter = false;
                sb.append("R");
            } else {
                int lLength = lCenter ? Math.abs(yPosition - ly) : Math.abs(yPosition - ly) + 1;
                int rLength = rCenter ? Math.abs(yPosition - ry) : Math.abs(yPosition - ry) + 1;

                if (lLength == rLength) {
                    sb.append(hand);
                    if (hand.equals("R")) {
                        ry = yPosition;
                        rCenter = true;
                    } else {
                        ly = yPosition;
                        lCenter = true;
                    }
                } else if (lLength > rLength){
                    ry = yPosition;
                    rCenter = true;
                    sb.append("R");
                } else {
                    ly = yPosition;
                    lCenter = true;
                    sb.append("L");
                }
            }
        }

        System.out.println("answer = " + sb.toString());
    }

    public static int findY(int number) {
        ArrayList<String> list = new ArrayList<>();
        list.add("123");
        list.add("456");
        list.add("789");
        list.add("0");

        String num = String.valueOf(number);
        int y = 0;
        for (int i=0; i<4; i++) {
            if(list.get(i).contains(num)) {
                y = i+1;
                break;
            }
        }

        return y;
    }

}
