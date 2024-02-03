package com.company.lv0.day_before;

/**
 * author         : yskwon
 * date           : 2023-05-04
 * title          : 두 수의 연산값 비교하기
 * Level          : lv.0
 * isSolved       : true
 * url            : https://school.programmers.co.kr/learn/courses/30/lessons/181938
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-05-04        yskwon       최초 생성
 */
public class Q230504_02 {

    public static void main(String[] args) {
        int answer = 0;
        int a = 2;
        int b = 91;

        String temp = "";
        temp += a;
        temp += b;

        answer = Integer.parseInt(temp);

        answer = answer > 2*a*b ? answer : 2*a*b;

        System.out.println("answer = " + answer);
    }

}
