package com.company.lv0.day_240224;

// https://school.programmers.co.kr/learn/courses/30/lessons/181913
public class Q4_문자열여러번뒤집기_wrong {

    private static String my_string	 = "rermgorpsam";
    private static int[][] queries	 = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};

    public static void main(String[] args) {
        for (int[] query : queries) {
            StringBuilder sb = new StringBuilder();
            sb.append(my_string.substring(query[0], query[1]+1));
            my_string = my_string.replaceFirst(sb.toString(), sb.reverse().toString());
        }

        System.out.println("answer = " + my_string);
    }
}
