package com.company.lv0.day_240221;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/181886
public class Q4_5명씩 {

    private static String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < names.length; i+=5) {
            list.add(names[i]);
        }
        list.toArray(new String[0]);
        System.out.println("list = " + list);
    }
}
