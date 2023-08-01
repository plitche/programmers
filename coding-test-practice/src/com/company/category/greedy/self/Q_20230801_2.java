package com.company.category.greedy.self;

import java.util.Arrays;
import java.util.Scanner;

/**
 * author         : yskwon
 * date           : 2023-08-01
 * title          :
 * Level          :
 * isSolved       :
 * url            :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-08-01        yskwon       최초 생성
 */
public class Q_20230801_2 {

    // 1이 될 때까지
    // 어떠한 수 N이 1이 될 때까지 다음의 두 과정 중 하나를 반복적으로 선택하여 수행하려고 한다. 단, 두 번째 연산은 N이 K로 나누어 떨어질 때만 선택할 수 있다.
    // 1. N에서 1을 뺀다
    // 2. N을 K로 나눈다
    // N과 K가 주어질 때 N이 1이 될 때까지 1번 혹은 2번의 과정을 수행해야 하는 최소 횟수를 구하는 프로그램을 작성하시오.
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int count = 0;
        while(n != 1) {
            if (n%k == 0) {
                n /= k;
            } else {
                n--;
            }

            count++;
        }

        System.out.println("count = " + count);
    }
}
