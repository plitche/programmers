package com.company.lv0.day_240224;

// https://school.programmers.co.kr/learn/courses/30/lessons/181915
public class Q2_글자이어붙여문자열만들기 {

    private static String my_string = "cvsgiorszzzmrpaqpe";
    private static int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        char[] chars = my_string.toCharArray();
        for (int i : index_list) sb.append(chars[i]);

        System.out.println("answer = " + sb.toString());
    }
}
