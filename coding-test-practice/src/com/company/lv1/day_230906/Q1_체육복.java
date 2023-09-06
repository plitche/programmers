package com.company.lv1.day_230906;

import java.util.ArrayList;
import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/42862
public class Q1_체육복 {

//    private static int n = 5;
//    private static int[] lost = {2, 4};
//    private static Integer[] reserve = {1, 3, 5};

    private static int n = 5;
    private static int[] lost = {1, 2, 3};
    private static Integer[] reserve = {2, 3, 4};

    public static void main(String[] args) {
        int answer = n;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        ArrayList<Integer> lostList = new ArrayList<>();
        for (Integer integer : lost) {
            lostList.add(integer);
        }

        ArrayList<Integer> reserveList = new ArrayList<>();
        for (Integer integer : reserve) {
            if (!lostList.contains(integer)) {
                reserveList.add(integer);
            } else {
                lostList.remove(integer);
            }
        }

        for (int i=0; i<lostList.size(); i++) {
            int idx = lostList.get(i);
            int check = check(idx, reserveList);

            if (check >= 0) {
                reserveList.remove(check);
            }
        }

        int count = lost.length - (reserve.length - reserveList.size()); // 잃어버린 사람 - (최초 여분 사람 - 다 빌려주고 여분 사람)
        answer -= count;

        System.out.println("answer = " + answer);
    }

    public static int check(int target, ArrayList<Integer> list){
        int idx = -1;

        for (int i=0; i<list.size(); i++) {
            int left = list.get(i);

            if (target-1 <= left && target+1 >= left) {
                idx = i;
                break;
            }
        }

        return idx;
    }

}
