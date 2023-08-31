package com.company.lv1.day_230831;

// https://school.programmers.co.kr/learn/courses/30/lessons/77884
public class Q5_약수의개수와덧셈 {

//    private static int left = 13;
//    private static int right = 17;

    private static int left = 24;
    private static int right = 27;

    public static void main(String[] args) {
        int answer = 0;

        for (int i=left; i<=right; i++) {
            if(check(i)) answer+=i;
            else answer-=i;
        }

        System.out.println("answer = " + answer);
    }

    public static boolean check(int number) {
        int count = 0;
        int lastIndex = number;
        for (int i=1; i<=lastIndex; i++) {
            int temp = 0;

            if (number%i == 0) {
                temp = number/i;
                if (temp == i) {
                    count += 1;
                } else {
                    count += 2;
                }

                lastIndex = temp-1;
            }
        }

        return count%2 == 0 ? true : false;
    }
}
