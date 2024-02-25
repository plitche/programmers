package com.company.lv0.day_240225;

// https://school.programmers.co.kr/learn/courses/30/lessons/181910
public class Q3_문자열뒤의n글자 {

    private static String my_string = "ProgrammerS123";
    private static int n = 11;

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int start = my_string.length()-1 >= n ? my_string.length()-n : 0;
        int end = my_string.length()-1;

        for (int i = start; i <= end; i++) {
            sb.append(my_string.charAt(i));
        }

        System.out.println("answer = " + sb);
    }
}
