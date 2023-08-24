package com.company.lv1.day_230824;

// https://school.programmers.co.kr/learn/courses/30/lessons/136798
public class Q1_기사단원의무기 {

    //private static int number = 5;
    //private static int limit = 3;
    //private static int power = 2;
    // 1, 1/2 ,1/3, 1/2/4, 1/5

    //private static int number = 10;
    //private static int limit = 3;
    //private static int power = 1;
    // 1, 1/2 ,1/3, 1/2/4, 1/5, 1/2/3/6, 1/7, 1/2/4/8, 1/3/9, 1/2/5/10 : 27

    private static int number = 16;
    private static int limit = 5;
    private static int power = 2;
    // 1/11, 1/2/3/4/6/12, 1/13, 1/2/7/14, 1/3/5/15, 1/2/4/8/16

    public static void main(String[] args) {
        int answer = 0;

        for (int i=1; i<=number; i++) {
            if (i == 1)  {
                answer += 1;
                continue;
            } else if (i == 2) {
                answer += 2;
                continue;
            } else if (i == 3) {
                answer += 2;
                continue;
            } else if (i == 4) {
                answer += limit < 3 ? power : 3;
                continue;
            }

            int check = check(i, limit);
            System.out.println("check = " + check);
            if (check > 0) {
                answer += check;
            } else {
                answer += power;
            }
        }

        System.out.println("answer = " + answer);
    }

    public static int check(int number, int max) {
        int count = 2;
        int temp = 2;

        for (int i=number/2; i>temp; i--) {
            if (number%i == 0) {
                if (count == 2) temp = number/i;

                if (number/i == i) {
                    count+=1;
                } else {
                    count+=2;
                }
            }
            if (count > max) {
                count = -1;
                break;
            }

        }

        return count;
    }

}
