package com.company.lv0.day_240222;

// https://school.programmers.co.kr/learn/courses/30/lessons/181882
public class Q4_조건에맞게수열변환하기2 {

    private static int[] arr = {1, 2, 3, 100, 99, 98};

    public static void main(String[] args) {
        int answer = -1;
        int[] compare = new int[arr.length];
        boolean isSame = false;

        while (!isSame) {
            for (int i = 0; i < arr.length; i++) {
                int num = arr[i];

                if (num >= 50 && arr[i] % 2 == 0) {
                    arr[i] = num/2;
                } else if (num < 50 && arr[i] % 2 == 1) {
                    arr[i] = num*2+1;
                }
                compare[i] = num;
            }

            isSame = true;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != compare[i]) {
                    isSame = false;
                    break;
                }
            }

            answer++;
        }

        System.out.println("answer = " + answer);
    }
}
