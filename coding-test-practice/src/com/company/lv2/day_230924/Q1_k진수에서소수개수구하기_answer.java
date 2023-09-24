package com.company.lv2.day_230924;

// https://school.programmers.co.kr/learn/courses/30/lessons/92335
public class Q1_k진수에서소수개수구하기_answer {

//    private static int n = 437674;
//    private static int k = 3;

//    private static int n = 110011;
//    private static int k = 10;

    private static int n = 1;
    private static int k = 10;

    public static void main(String[] args) {
        int ans = 0;
        String temp[] = Integer.toString(n, k).split("0");

        Loop : for(String t : temp) {
            if(t.length() == 0) continue;
            long a = Long.parseLong(t);
            if(a == 1) continue;
            for(int i=2; i<=Math.sqrt(a); i++)
                if(a%i == 0) continue Loop;

            ans++;
        }

        System.out.println("ans = " + ans);
    }
}
