package com.company.lv0.day_before;

/**
 * author         : yskwon
 * date           : 2023-04-20
 * title          : 다음에 올 숫자
 * Level          : lv.0
 * isSolved       : true
 * url            : https://school.programmers.co.kr/learn/courses/30/lessons/120924
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-04-20        yskwon       최초 생성
 */
public class Q230420_02 {

    public static void main(String[] args) {
        int[] common1 = {1, 2, 3, 4};
        int[] common2 = {2, 4, 8};

        int solution = solution(common1);
        System.out.println("solution = " + solution);

        int solution2 = solution(common2);
        System.out.println("solution2 = " + solution2);

    }

    public static int solution(int[] arr) {
        int answer = 0;

        int length = arr.length;
        if (arr[0] - arr[1] == arr[1] - arr[2]) {
            answer = arr[length-1] + (arr[length-1] - arr[length-2]);
        } else {
            answer = arr[length-1] * (arr[length-1] / arr[length-2]);
        }

        return answer;
    }


}
