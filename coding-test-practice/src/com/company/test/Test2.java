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
public class Test2 {

    public static void main(String[] args) {

        String my_string = "He11oWor1d";
        String overwrite_string = "lloWorl";
        int s = 2;

        String answer = "";

        int length = overwrite_string.length();

        String substring1 = my_string.substring(0, s);
        String substring2 = my_string.substring(s + length);
    }
}
