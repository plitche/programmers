package com.company.category.Implementation;

// 정수 N이 입력되면 00시 00분 00초부터 N시 59분 59초까지의 모든 시각중 3이 하나라도 포함되어 있는 모든 경우의 수
// N : 1
// 세어야 하는 시각
// 00시 00분 03초
// 00시 13분 30초

import java.util.Scanner;

// 세지 말아야 하는 시각
// 00시 02분 55초
// 01시 27분 45초
public class Time {

    public static Scanner sc = new Scanner(System.in);
    public static int n = 0;

    public static void main(String[] args) {
        n = sc.nextInt();

        int count = 0;
        for (int i=0; i<=n; i++) {
            if (String.valueOf(i).contains("3")) {
                count += (60*60);
                continue;
            } else {
                for (int j=0; j<60; j++) {
                    if (String.valueOf(j).contains("3")) {
                        count += 60;
                        continue;
                    } else {
                        for (int k=0; k<60; k++) {
                            if (String.valueOf(k).contains("3")) {
                                count++;
                            }
                        }
                    }
                }
            }
        }

        System.out.println("count = " + count);
    }

}

class TimeSolution {

    public static void main(String[] args) {
        Time.n = Time.sc.nextInt();
        int cnt = 0;

        for (int i=0; i<=Time.n; i++) {
            for (int j=0; j<60; j++) {
                for (int k=0; k<60; k++) {
                    if (check(i, j, k)) cnt++;
                }
            }
        }

        System.out.println("cnt = " + cnt);
    }

    public static boolean check(int h, int m, int s) {
        if (h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3)
            return true;
        return false;
    }
}
