package com.company.lv1.day_230820;

// https://school.programmers.co.kr/learn/courses/30/lessons/155652
public class Q5_둘만의암호_01 {

    private static String s = "aukks";
    private static String skip = "wbqd";
    private static int index = 5;

    //private static String s = "klmnopqrstuvwxyz";
    //private static String skip = "abcdefghij";
    //private static int index = 20;

    public static void main(String[] args) {
        String answer = "";

        char[] sChar = s.toCharArray();
        for (char c : sChar) {
            char temp = c;

            for (int i=0; i<index; i++) {
                temp = temp == 'z' ? 'a' : (char)(temp+1);

                if (skip.contains(String.valueOf(temp))) {
                    i-=1;
                }
            }
            answer += temp;
        }

        System.out.println("answer = " + answer);
    }
}
