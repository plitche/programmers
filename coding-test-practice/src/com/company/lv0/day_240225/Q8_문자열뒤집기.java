package com.company.lv0.day_240225;

// https://school.programmers.co.kr/learn/courses/30/lessons/181906
public class Q8_문자열뒤집기 {

    private static String my_string = "Progra21Sremm3";
    private static int s = 6;
    private static int e = 12;

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        int count = 0;
        for(int i = 0; i < my_string.length(); i++) {
            if(i >= s && i <= e) {
                sb.append(my_string.charAt(e-count));
                count++;
            } else {
                sb.append(my_string.charAt(i));
            }
        }

        System.out.println("answer = " + sb.toString());
    }
}
