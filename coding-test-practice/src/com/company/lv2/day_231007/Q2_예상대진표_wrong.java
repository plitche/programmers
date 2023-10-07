package com.company.lv2.day_231007;

// https://school.programmers.co.kr/learn/courses/30/lessons/12985
public class Q2_예상대진표_wrong {

    private static int n = 8;
    private static int a = 4;
    private static int b = 7;

//    private static int n = 4;
//    private static int a = 2;
//    private static int b = 3;

    public static void main(String[] args) {
        int answer = 1;

        if (a>b) {
            int temp = a;
            a = b;
            b = temp;
        }

        while(true) {
            if (a%2 == 1 && b == a+1){
                break;
            }

            if (a == 1 || a == 2) {
                a = 1;
            } else if (a %2 == 0) {
                a = (a -1)/2 + 1;
            } else {
                a = (a -2)/2 + 1;
            }

            if (b %2 == 0) {
                b = (b -2)/2 + 1;
            } else {
                b = b /2 + 1;
            }

            answer++;
            System.out.println("A = " + a);
            System.out.println("B = " + b);
        }

        System.out.println("answer = " + answer);
    }

}
