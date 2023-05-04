package com.company.test;

/**
 * author         : yskwon
 * date           : 2023-04-20
 * title          :
 * Level          :
 * isSolved       :
 * url            :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-04-20        yskwon       최초 생성
 */
public class Test5 {

    public static void main(String[] args) {

        String myString = "banana";
        String pat = "ana";

        int answer = 0;

        for (int i=0; i<myString.length(); i++) {
            if (myString.substring(i).startsWith(pat)) {
                answer++;
            }
        }

        System.out.println("answer = " + answer);
    }

}
