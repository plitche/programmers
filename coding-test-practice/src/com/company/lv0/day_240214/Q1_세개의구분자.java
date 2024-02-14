package com.company.lv0.day_240214;

// https://school.programmers.co.kr/learn/courses/30/lessons/181862
public class Q1_세개의구분자 {

//    private static String myStr = "baconlettucetomato";
//    private static String myStr = "abcd";
//    private static String myStr = "cabab";

    private static String myStr = "eeeabcdabcabee";

    public static void main(String[] args) {
        myStr = myStr.replace('a', ' ')
                .replace('b', ' ')
                .replace('c', ' ')
                .trim()
                .replaceAll("\\s+", " ");

        String[] answer = myStr.split(" ");
        if (answer.length == 1 && answer[0].equals("")) {
            answer[0] = "EMPTY";
        }

        for (String s : answer) {
            System.out.println("s = " + s);
        }
    }
}
