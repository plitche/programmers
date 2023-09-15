package com.company.lv1.day_230915;

import java.util.ArrayList;

// https://school.programmers.co.kr/learn/courses/30/lessons/1845
public class Q8_포켓몬 {

    //private static int[] nums = {3,1,2,3};
    private static int[] nums = {3, 3, 3, 2, 2, 4};

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<nums.length; i++) {
            if (!list.contains(nums[i])) {
                list.add(nums[i]);
            }
        }

        int answer = list.size() > nums.length/2 ? nums.length/2 : list.size();

        System.out.println("answer = " + answer);
    }

}
