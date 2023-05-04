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
public class Test3 {
    public static void main(String[] args) {
        String str1 = "aaa";
        String str2 = "bbb";
        String answer = "";

        int length = str1.length();
        String[] str1arr = str1.split("");
        String[] str2arr = str2.split("");
        for (int i=0; i<length; i++) {
            answer += str1arr[i]+str2arr[i];
        }

        System.out.println("answer = " + answer);
    }

}
