package com.company.lv1.day_230910;

// https://school.programmers.co.kr/learn/courses/30/lessons/12944
public class Q5_콜라츠추측 {

//    private static int num = 6;
    private static int num = 626331;

    public static void main(String[] args) {
        int answer = 0;
        long temp = num;
        if (num != 1) {
            while(temp != 1) {
                if (temp%2 == 0) temp/=2;
                else temp = temp*3 + 1;
                answer+=1;

                if (answer > 500) {
                    answer = -1;
                    break;
                }
            }
        }

        System.out.println("answer = " + answer);
    }

}
