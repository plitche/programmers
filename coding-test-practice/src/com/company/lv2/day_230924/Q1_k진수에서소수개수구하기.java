package com.company.lv2.day_230924;

// https://school.programmers.co.kr/learn/courses/30/lessons/92335
public class Q1_k진수에서소수개수구하기 {

//    private static int n = 437674;
//    private static int k = 3;

//    private static int n = 110011;
//    private static int k = 10;

    private static int n = 1;
    private static int k = 10;

    public static void main(String[] args) {
        int answer = 0;

        String change = change(n, k);
        String[] split = change.split("0");

        for (String s : split) {
            if (!s.equals("") && isPrimeNumber(Long.parseLong(s))) {
                answer += 1;
            }
        }

        System.out.println("answer = " + answer);
    }

    public static String change(int n, int k) {
        StringBuilder sb = new StringBuilder();

        while(n > 0) {
            int left = n%k;
            sb.insert(0, left);
            n = n/k;
        }
        return sb.toString();
    }

    public static boolean isPrimeNumber(Long num) {
        if (num == 1) return false;
        boolean result = true;

        int max = (int)Math.sqrt(num);
        for (int i=2; i<=max; i++) {
            if (num%i == 0) {
                result = false;
                break;
            }
        }

        return result;
    }
}
