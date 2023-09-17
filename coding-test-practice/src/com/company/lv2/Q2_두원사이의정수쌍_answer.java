package com.company.lv2;

// https://school.programmers.co.kr/learn/courses/30/lessons/181188
public class Q2_두원사이의정수쌍_answer {

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

        int smallY = 0;
        int bigY = 0;
        for(int i=1;i<r2;i++){
            smallY = (int)Math.sqrt((long)r1*r1-(long)i*i);
            bigY = (int)Math.sqrt((long)r2*r2-(long)i*i);
            answer += (long)(bigY-smallY)*4;
            // 작은원의 테두리가 격자점을 지나면 하나 추가 *4사분면
            if(i<r1 && Math.sqrt((long)r1*r1-(long)i*i)%1 ==0) answer+=4L;
        }

        System.out.println("answer = " + answer);
    }

}
