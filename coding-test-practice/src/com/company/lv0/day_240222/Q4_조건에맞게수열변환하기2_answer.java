package com.company.lv0.day_240222;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/181882
public class Q4_조건에맞게수열변환하기2_answer {

    private static int[] arr = {1, 2, 3, 100, 99, 98};

    public static void main(String[] args) {
        int answer = Arrays.stream(arr).map(i -> cntAction(i)).max().getAsInt();
        System.out.println("answer = " + answer);
    }

    private static int cntAction(int n) {

        int cnt = 0;
        boolean flag = true;

        while (flag) {

            if (n % 2 == 0 && 50 <= n) {
                n /= 2;
                cnt++;
            } else if (n % 2 == 1 && n < 50) {
                n *= 2;
                n += 1;
                cnt++;
            } else {
                flag = false;
            }
        }
        return cnt;
    }
}
