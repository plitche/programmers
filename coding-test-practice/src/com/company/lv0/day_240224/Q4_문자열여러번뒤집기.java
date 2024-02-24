package com.company.lv0.day_240224;

// https://school.programmers.co.kr/learn/courses/30/lessons/181913
public class Q4_문자열여러번뒤집기 {

    private static String my_string	 = "rermgorpsam";
    private static int[][] queries	 = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int[] query : queries) {
            char[] chars = my_string.substring(query[0], query[1] + 1).toCharArray();

            for (int i = 0; i < query[0]; i++) {
                sb.append(my_string.charAt(i));
            }

            for (int i = chars.length-1; i >= 0; i--) {
                sb.append(chars[i]);
            }

            for (int i = query[1]+1; i < my_string.length(); i++) {
                sb.append(my_string.charAt(i));
            }

            my_string = sb.toString();
            sb = new StringBuilder();
        }

        System.out.println("answer = " + my_string);
    }
}
