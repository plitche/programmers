package com.company.lv1.day_230901;

// https://school.programmers.co.kr/learn/courses/30/lessons/77484
public class Q1_로또의최고순위와최저순위 {

//    private static int[] lottos = {44, 1, 0, 0, 31, 25};
//    private static int[] win_nums = {31, 10, 45, 1, 6, 19};

//    private static int[] lottos = {0, 0, 0, 0, 0, 0};
//    private static int[] win_nums = {38, 19, 20, 40, 15, 25};

    private static int[] lottos = {1, 2, 3, 4, 5, 6};
    private static int[] win_nums = {7, 8, 9, 10, 11, 12};

    public static void main(String[] args) {
        int[] answer = new int[2];

        int count = 0;
        int zeroCount = 0;
        for (int i=0; i<lottos.length; i++) {
            int lotto = lottos[i];

            if (lotto == 0) {
                zeroCount+=1;
            } else {
                for (int j=0; j< win_nums.length; j++) {
                    if (lotto == win_nums[j]) {
                        count+=1;
                        break;
                    }
                }
            }
        }

        answer[0] = 7 - (count + zeroCount);
        answer[0] = answer[0] > 6 ? 6 : answer[0];
        answer[1] = 7 - (count);
        answer[1] = answer[1] > 6 ? 6 : answer[1];

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }

}
