package com.company.category.greedy.self;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

/**
 * author         : yskwon
 * date           : 2023-08-03
 * title          :
 * Level          :
 * isSolved       :
 * url            :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-08-03        yskwon       최초 생성
 */
public class Q_20230803_3 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/42862
    public static void main(String[] args) {
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};

//        List<Integer> reserveList = new ArrayList<>(Arrays.asList(reserve));

        int result = 0;

        for (int i=0; i<lost.length; i++) {
            int lostMember = lost[i];

            if (lostMember == 1) { // 첫번째 멤버
                for (int j=0; j<reserve.length; j++) {
                    if (reserve[j] == 2) {
                        reserve[j] = -1;
                        result++;
                        break;
                    }
                }
            } else if (lostMember == lost.length + reserve.length) { // 마지막 멤버
                for (int j=0; j<reserve.length; j++) {
                    if (reserve[j] == lostMember-1) {
                        reserve[j] = -1;
                        result++;
                        break;
                    }
                }
            } else {
                for (int j=0; j<reserve.length; j++) {
                    if (reserve[j] == lostMember-1 || reserve[j] == lostMember+1) {
                        reserve[j] = -1;
                        result++;
                        break;
                    }
                }
            }
        }

        System.out.println("result = " + (result + reserve.length));
    }
}
