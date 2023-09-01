package com.company.lv1.day_230901;

// https://school.programmers.co.kr/learn/courses/30/lessons/76501
public class Q1_음양더하기 {

    private static int[] absolutes = {4,7,12};
    private static boolean[] signs = {true,false,true};

    public static void main(String[] args) {
        int answer = 0;

        for (int i=0; i<absolutes.length; i++) {
            if (signs[i]) answer += absolutes[i];
            else answer -= absolutes[i];
        }

        System.out.println("answer = " + answer);
    }

}
