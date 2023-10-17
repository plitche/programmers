package com.company.lv2.day_231017;

// https://school.programmers.co.kr/learn/courses/30/lessons/154538
public class Q1_연속된부분수열의합 {

    private static int[] sequence = {1, 2, 3, 4, 5};
    private static int k = 7;

    public static void main(String[] args) {
        int N = sequence.length;

        int left = 0, right = N;
        int sum = 0;
        for(int L = 0, R = 0; L < N; L++) {
            while(R < N && sum < k) {
                sum += sequence[R++];
            }

            if(sum == k) {
                int range = R - L - 1;
                if((right - left) > range) {
                    left = L;
                    right = R - 1;
                }
            }
            sum -= sequence[L];

        }

        int[] answer = {left, right};


        System.out.println(answer[0] + " : " + answer[1]);
    }

}
