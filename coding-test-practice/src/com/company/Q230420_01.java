package com.company;

/**
 * author         : yskwon
 * date           : 2023-04-20
 * title          : 옹알이 (1)
 * Level          : lv.0
 * isSolved       :
 * url            : https://school.programmers.co.kr/learn/courses/30/lessons/120956
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-04-20        yskwon       최초 생성
 */
public class Q230420_01 {

    public static void main(String[] args) {

        String[] word = {"aya", "yee", "u", "maa", "wyeoo"};

        int solution = solution(word);
        System.out.println("solution = " + solution);
    }

    public static int solution(String[] word) {
        String[] arr = {"aya", "ye", "woo", "ma"};

        int count = 0;

        for (String a : word) {
            String replacedWord = a;
            for (String b : arr) {
                replacedWord = replacedWord.replace(b, " ");
            }

            if (replacedWord.trim().equals("")) {
                count++;
            }
        }

        return count;
    }

}
