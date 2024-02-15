package com.company.lv0.day_240215;

// https://school.programmers.co.kr/learn/courses/30/lessons/181900
public class Q1_글자지우기 {

    private static String my_string = "apporoograpemmemprs";
    private static int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        char[] string = my_string.toCharArray();

        for (int i = 0; i < string.length; i++) {
            boolean isContain = false;

            for (int index : indices) {
                if (i == index) {
                    isContain = true;
                    break;
                }
            }

            if (!isContain) sb.append(string[i]);
        }

        System.out.println("my_string = " + sb.toString());
    }
}
