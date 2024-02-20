package com.company.lv0.day_240220;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/181890
public class Q3_왼쪽오른쪽_1 {

    private static String[] str_list = {"u", "u", "l", "r"};

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                for (int j = 0; j < i; j++) {
                    list.add(str_list[j]);
                }
                break;
            } else if (str_list[i].equals("r")) {
                for (int j = i; j < str_list.length; j++) {
                    list.add(str_list[j]);
                }
                break;
            }
        }
        
        list.toArray(new String[0]);
        System.out.println("list = " + list);
    }
}
