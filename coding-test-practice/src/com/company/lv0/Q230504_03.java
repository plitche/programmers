package com.company.lv0;

/**
 * author         : yskwon
 * date           : 2023-05-04
 * title          : n의 배수
 * Level          : lv.0
 * isSolved       : true
 * url            : https://school.programmers.co.kr/learn/courses/30/lessons/181937
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-05-04        yskwon       최초 생성
 */
public class Q230504_03 {

    public static void main(String[] args) {
        int answer = 0;
        int num = 98;
        int n = 2;

        answer = num%n == 0 ? 1 : 0;
        System.out.println("answer = " + answer);
    }

}
