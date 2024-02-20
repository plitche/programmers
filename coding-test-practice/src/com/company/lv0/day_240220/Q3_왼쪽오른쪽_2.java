package com.company.lv0.day_240220;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/181890
public class Q3_왼쪽오른쪽_2 {

//    private static String[] str_list = {"u", "u", "l", "r"};
//    private static String[] str_list = {"l"};
    private static String[] str_list = {"u", "u", "r", "l"};

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        int start = 0;
        int end = str_list.length;
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) end = i;
            else if (str_list[i].equals("r")) start = i+1;

            if (start != 0 || end != str_list.length) {
                for (int j = start; j < end; j++) list.add(str_list[j]);
                break;
            }
        }
        
        list.toArray(new String[0]);
        System.out.println("list = " + list);
    }
}
