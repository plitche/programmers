package com.company.lv1.day_230908;

// https://school.programmers.co.kr/learn/courses/30/lessons/12977
public class Q3_소수만들기 {

    // private static int[] nums = {1, 2, 3, 4};
    private static int[] nums = {1, 2, 7, 6, 4};

    public static void main(String[] args) {
        int answer = 0;

        for (int i=0; i<nums.length-2; i++) {
            int a = nums[i];
            for (int j=i+1; j<nums.length-1; j++) {
                int b = nums[j];
                for (int k=j+1; k<nums.length; k++) {
                    int c = nums[k];

                    if (isPrimeNum(a+b+c)) {
                        answer += 1;
                    }
                }
            }
        }

        System.out.println("answer = " + answer);
    }

    public static boolean isPrimeNum(int number) {
        boolean result = true;

        for (int i=2; i<=Math.sqrt(number); i++) {
            if ((number % i) == 0) {
                result = false;
                break;
            }
        }

        return result;
    }

}
