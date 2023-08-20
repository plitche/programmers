package com.company.lv1.day_230820;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/155652
public class Q5_둘만의암호_02 {

    private static String s = "aukks";
    private static String skip = "wbqd";
    private static int index = 5;

    //private static String s = "klmnopqrstuvwxyz";
    //private static String skip = "abcdefghij";
    //private static int index = 20;

    public static void main(String[] args) {
        String answer = "";

        ArrayList<Character> alpa = new ArrayList<>(List.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
        for (int i=0; i<skip.length(); i++) {
            alpa.remove((Character)(skip.charAt(i)));
        }

        Character[] arr = alpa.toArray(new Character[alpa.size()]);

        char[] sChar = s.toCharArray();
        for (char c : sChar) {

            char temp = 0;
            for (int i=0; i<arr.length; i++) {
                if (c == arr[i]) {
                    if ((i+index) > arr.length-1) {
                        temp = arr[(i+index)%arr.length];
                    } else {
                        temp = arr[i+index];
                    }
                }
            }

            answer += temp;
        }

        System.out.println("answer = " + answer);
    }
}
