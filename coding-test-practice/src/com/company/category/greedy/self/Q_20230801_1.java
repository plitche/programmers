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
public class Q_20230801_1 {

    // 숫자 카드 게임
    // 1. 숫자가 쓰인 카드들이 N X M 형태로 놓여 있다. 이 때 N은 행의 개수를 의미하며, M은 열의 개수를 의미한다.
    // 2. 먼저 뽑고자 하는 카드가 포함되어 있는 행을 선택한다.
    // 3. 그다음 선택된 행에 포함된 카드들 중 가장 숫자가 낮은 카드를 뽑아야 한다.
    // 4. 따라서 처음에 카드를 골라낼 행을 선택할 때, 이후에 해당 행에서 가장 숫자가 낮은 카드를 뽑을 것을 고려하여 최종적으로 가장 높은 숫자의 카드를 뽑을 수 있도록 전략을 세워야 한다.
    // 카드들이 N X M 형태로 놓여 있을 때, 게임의 룰에 맞게 카드를 뽑는 프로그램을 만드시오.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nm = sc.nextLine();
        String[] s = nm.split(" ");

        String[] numbers = new String[Integer.parseInt(s[0])];

        for (int i=0; i<Integer.parseInt(s[0]); i++) {
            String[] each = sc.nextLine().split(" ");
            Arrays.sort(each);
            numbers[i] = each[Integer.parseInt(s[1])-1];
        }

        Arrays.sort(numbers);
        System.out.println("number = " + numbers[0]);
    }
}
