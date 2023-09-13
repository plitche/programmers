package com.company.lv1.day_230913;

// https://school.programmers.co.kr/learn/courses/30/lessons/12919
public class Q3_서울에서김서방찾기 {

    private static String[] seoul = {"Jane", "Kim"};

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("김서방은 ");
        for (int i=0; i<seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                sb.append(i + "에 있다");
                break;
            }
        }

        System.out.println("answer = " + sb.toString());
    }
}
