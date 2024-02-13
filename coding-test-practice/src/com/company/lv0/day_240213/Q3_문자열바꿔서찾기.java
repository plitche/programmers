package com.company.lv0.day_240213;

// https://school.programmers.co.kr/learn/courses/30/lessons/181864
public class Q3_문자열바꿔서찾기 {

//     private static String myString = "ABBAA";
//     private static String pat = "AABB";

     private static String myString = "ABAB";
     private static String pat = "ABAB";

    public static void main(String[] args) {
        myString = myString.replaceAll("A", "1")
                .replaceAll("B", "2")
                .replaceAll("1", "B")
                .replaceAll("2", "A");

        if (myString.contains(pat)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}
