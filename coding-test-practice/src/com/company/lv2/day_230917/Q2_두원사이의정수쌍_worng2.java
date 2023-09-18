package com.company.lv2.day_230917;

// https://school.programmers.co.kr/learn/courses/30/lessons/181188
public class Q2_두원사이의정수쌍_worng2 {

//    private static int r1 = 2;
//    private static int r2 = 3;
    // 20

    private static int r1 = 2;
    private static int r2 = 4;

//    private static int r1 = 1;
//    private static int r2 = 3;
    // 28

//    private static int r1 = 1;
//    private static int r2 = 2;
    // 12
    public static void main(String[] args) {
        // 변에 있는 점수
        long answer = (r2-r1+1) * 4;

        long r1Count = 0;
        long r2Count = 0;
        for (long i=1; i<=r2; i++) {
            for (long j=1; j<=r2; j++) {
                double sqrt = Math.sqrt(Math.pow((long)i, 2) + Math.pow((long)j, 2));

                if (sqrt <= r1) { // 사분면 중 r1반지름안에 점 개수
                    r1Count++;
                }
                if (sqrt <= r2) { // 사분면 중 r2반지름안에 점 개수
                    System.out.println("i = " + i);
                    System.out.println("j = " + j);
                    System.out.println("sqrt = " + sqrt);
                    r2Count++;
                }
            }
        }

        System.out.println("r2Count = " + r2Count);
        System.out.println("r1 = " + r1Count);

        answer += (r2Count - r1Count) * 4; // 공통의 범위 제외 * 4사분면
        System.out.println("answer = " + answer);
    }

}
