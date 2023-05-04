package com.company.test;

import java.util.Arrays;
import java.util.stream.Collectors;

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
public class Test4 {
    public static void main(String[] args) {
        String[] arr = {"a","b","c"};
        String collect = Arrays.stream(arr).collect(Collectors.joining());
        System.out.println("collect = " + collect);
    }

}
