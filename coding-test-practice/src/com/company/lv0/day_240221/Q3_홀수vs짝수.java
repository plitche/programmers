package com.company.lv0.day_240221;

// https://school.programmers.co.kr/learn/courses/30/lessons/181887
public class Q3_홀수vs짝수 {

//    private static int[] num_list = {4, 2, 6, 1, 7, 6};
    private static int[] num_list = {-1, 2, 5, 6, 3};

    public static void main(String[] args) {
        int odd = 0, even = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (i%2 == 0) even += num_list[i];
            else odd += num_list[i];
        }

        System.out.println(even > odd ? even : odd);
    }
}
