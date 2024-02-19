package com.company.lv0.day_240219;

// https://school.programmers.co.kr/learn/courses/30/lessons/181894
public class Q4_배열조각하기_wrong {

    private static int[] arr = {0, 1, 2, 3, 4, 5};
    private static int[] query = {4, 1, 2};

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (Integer i : arr) sb.append(i);
        String number = sb.toString();

        for (int i = 0; i < query.length; i++) {
            if (i%2 == 0) {
                number = number.substring(0, number.indexOf(String.valueOf(query[i]))+1);
            } else {
                number = number.substring(number.indexOf(String.valueOf(query[i])));
            }
        }

        System.out.println("answer = " + number);
    }
}
