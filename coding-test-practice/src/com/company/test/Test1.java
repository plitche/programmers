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
public class Test1 {

    public static void main(String[] args) {

        String[] a = {"aya", "ye"};
        String[] b = a;

        for (String s : a) {
            for (String s1 : b) {
                String replace = s.replace(s1, "");
            }

            System.out.println("s = " + s);
        }
    }
}
