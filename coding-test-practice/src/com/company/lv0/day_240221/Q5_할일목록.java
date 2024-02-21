package com.company.lv0.day_240221;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/181885
public class Q5_할일목록 {

    private static String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
    private static boolean[] finished = {true, false, true, false};

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) list.add(todo_list[i]);
        }
        list.toArray(new String[0]);
        System.out.println("list = " + list);
    }
}
