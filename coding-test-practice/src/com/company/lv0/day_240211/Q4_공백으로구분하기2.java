package com.company.lv0.day_240211;

// https://school.programmers.co.kr/learn/courses/30/lessons/181868
public class Q4_공백으로구분하기2 {

    private static String my_string = " i    love  you";
    // private static String my_string = "    programmers  ";

    public static void main(String[] args) {
        my_string = my_string.trim();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) != ' ' || (my_string.charAt(i) == ' ' && my_string.charAt(i-1) != ' ')) {
                sb.append(my_string.charAt(i));
            }
        }

        String[] answer = sb.toString().split(" ");

        for (String s : answer) {
            System.out.println("s = " + s);
        }
    }
}
