package com.company.lv0;

/**
 * author         : yskwon
 * date           : 2023-05-04
 * title          : 더 크게 합치기
 * Level          : lv.0
 * isSolved       : true
 * url            : https://school.programmers.co.kr/learn/courses/30/lessons/181939
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-05-04        yskwon       최초 생성
 */
public class Q230504_01 {

    public static void main(String[] args) {
        int a = 9;
        int b = 91;

        String temp1 = "";
        temp1 += a;
        temp1 += b;

        System.out.println("temp1 = " + temp1);

        String temp2 = "";
        temp2 += b;
        temp2 += a;

        System.out.println("temp2 = " + temp2);

        int answer = 0;
        if (Integer.parseInt(temp1) >= Integer.parseInt(temp2)) {
            answer = Integer.parseInt(temp1);
        } else {
            answer = Integer.parseInt(temp2);
        }

        System.out.println("answer = " + answer);
    }

}
