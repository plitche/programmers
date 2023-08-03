package com.company.category.greedy.self;

/**
 * author         : yskwon
 * date           : 2023-08-03
 * title          :
 * Level          :
 * isSolved       :
 * url            :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-08-03        yskwon       최초 생성
 */
public class Q_20230803_2 {

    // 예를 들어, 누군가 2,730원 어치의 물건을 사고 5,000원을 냈다고 가정하면 거스름돈은 총 2,270원이 될 것이다. 이 때, 지폐와 동전 종류가 아래와 같을 때, 최소의 개수로 거스름돈을 주는 경우는 어떤 경우일까?
    // 지폐 및 동전의 종류 : 1,000원, 500원, 100원, 50원, 10원
    // 정답 : 1,000원 2개 / 100원 2개 / 50원 1개 / 10원 2개로 총 7개

    public static void main(String[] args) {

        int amount = 5000;
        int payment = 2730;
        int[] coins = {1000, 500, 100, 50, 10};

        int rest = amount - payment; // 2270
        int count = 0;
        for (int coin : coins) {
            if (rest > coin) {
                count += rest/coin;
                rest -= coin*(rest/coin);
            }
        }

        System.out.println("count = " + count);
    }
}
