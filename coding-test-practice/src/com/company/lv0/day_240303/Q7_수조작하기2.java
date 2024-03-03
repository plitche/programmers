package com.company.lv0.day_240303;

// https://school.programmers.co.kr/learn/courses/30/lessons/181926
public class Q7_수조작하기2 {

    private static int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int before = numLog[0];

        for (int i = 1; i < numLog.length; i++) {
            int differ = numLog[i] - before;

            switch (differ) {
                case 1 : sb.append('w'); break;
                case -1 : sb.append('s'); break;
                case 10 : sb.append('d'); break;
                case -10 : sb.append('a'); break;
            }

            before = numLog[i];
        }

        System.out.println("n = " + sb.toString());
    }
}
