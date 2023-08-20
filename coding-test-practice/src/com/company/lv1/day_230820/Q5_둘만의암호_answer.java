package com.company.lv1.day_230820;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/155652
public class Q5_둘만의암호_answer {

    private static String s = "aukks";
    private static String skip = "wbqd";
    private static int index = 5;

    //private static String s = "klmnopqrstuvwxyz";
    //private static String skip = "abcdefghij";
    //private static int index = 20;

    public static void main(String[] args) {
        StringBuilder answer = new StringBuilder();

        for (char letter : s.toCharArray()) {
            char temp = letter;
            int idx = 0;
            while (idx < index) {
                temp = temp == 'z' ? 'a' : (char) (temp + 1);
                if (!skip.contains(String.valueOf(temp))) {
                    idx += 1;
                }
            }
            answer.append(temp);
        }

        System.out.println("answer = " + answer);
    }
}
