package com.company.lv0.day_before;

import java.util.ArrayList;
import java.util.List;

/**
 * author         : yskwon
 * date           : 2023-04-20
 * title          : 연속된 수의 합
 * Level          : lv.0
 * isSolved       : true
 * url            : https://school.programmers.co.kr/learn/courses/30/lessons/120923
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-04-20        yskwon       최초 생성
 */
public class Q230420_03 {

    public static void main(String[] args) {

        int[] solution = solution(3, 12);
        for (int i : solution) {
            System.out.println("i = " + i);
        }

        System.out.println("==========================");

        int[] solution2 = solution(4, 14);
        for (int i : solution2) {
            System.out.println("i = " + i);
        }

        System.out.println("==========================");

        int[] solution3 = solution(5, 5);
        for (int i : solution3) {
            System.out.println("i = " + i);
        }
    }

    public static int[] solution(int num, int total) {
        List<Integer> list = new ArrayList<>();

        int share = total/num;
        int left = total%num;

        if (num%2 == 0 && left != 0) share += 1;

        int start = share - (num/2);
        int end = share - (num/2) + num;

        for (int i=start; i<end; i++) {
            list.add(i);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

}
