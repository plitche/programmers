package com.company.category.greedy;

public class Until1 {

    // 어떠한 수 N이 1이 될 때까지 다음의 두 과정 중 하나를 반복적으로 선택하여 수행해라.
    // 1. N에서 1을 뺍니다.
    // 2. N을 K로 나눕니다.(나누어 떨어질 때만)
    // N:17, K:4 => 17, 16, 8, 4, 1
    // 최소 횟수를 찾아라.
    public static void main(String[] args) {
        int n = 25;
        int k = 3;

        int count = 0;
        while(n != 1) {
            if (n%k == 0) {
                n /= k;
            } else {
                n -= 1;
            }

            count++;
        }

        System.out.println("count = " + count);
    }
}

class Solution2 {
    public static void main(String[] args) {
        int n = 25;
        int k = 3;
        int result = 0;

        while(true) {
            // N이 K로 나누어 떨어지는 수가 될 때까지 빼기
            int target = (n / k) * k;
            result += (n - target);
            n = target;

            // N이 K보다 작을 때(더 이상 나눌 수 없을 때)
            if (n < k) break;

            // K로 나누기
            result += 1;
            n /= k;
        }

        // 마지막으로 남은 수에 대하여 1씩 빼기
        result += (n - 1);
        System.out.println("result = " + result);
    }
}