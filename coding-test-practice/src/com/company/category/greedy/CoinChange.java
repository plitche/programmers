package com.company.category.greedy;

public class CoinChange {

    public static void main(String[] args) {
        // Coin change
        // [10, 100, 500] = 710원 -> 최소한의 동전 개수

        int[] arrCoin = {500, 100, 10};
        int count = 0;
        int sum = 710;

        int index = 0;
        while(sum > 0 && index <= arrCoin.length) {
            if (sum/arrCoin[index] > 0) {
                sum -= arrCoin[index];
                count++;
            } else {
                index++;
            }
        }

        System.out.println("count = " + count);
    }

}

class CoinChange2 {

    public static void main(String[] args) {
        // Coin change
        // [10, 100, 500] = 710원 -> 최소한의 동전 개수

        int[] arrCoin = {500, 100, 10};
        int count = 0;
        int sum = 710;

        for (int a : arrCoin) {
            count += sum/a;
            sum -= sum/a * a;
        }

        System.out.println("count = " + count);
    }

}

