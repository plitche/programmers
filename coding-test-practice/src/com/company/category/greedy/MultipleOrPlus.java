package com.company.category.greedy;

public class MultipleOrPlus {

    // 곱하기 혹은 더하기
    // 각 자리가 0~9로 이루어진 문자열 S가 주어졌을 때 숫자 사이에 'x', '+'연산자를 넣어 결과적으로 만들어 질 수 있는 가장 큰 수를 구하라.
    // 단 사칙연산과 다르게 모든 연산은 왼쪽에서 부터 순서대로 이루어진다.

    public static void main(String[] args) {
        String s = "02984";

        int result = 1;
        for (int i=0; i<s.length(); i++) {
            int c = s.charAt(i) - 48;

            if (c != 0) {
                result *= c;
            }
        }

        System.out.println("result = " + result);
    }
}

class MultipleOrPlusSolution {
    public static void main(String[] args) {
        String s = "02984";

        int result = s.charAt(0) - '0';
        for (int i=1; i<s.length(); i++) {
            int c = s.charAt(i) - '0';

            if (result <= 1 || c <= 1) {
                result += c;
            } else {
                result *= c;
            }
        }

        System.out.println("result = " + result);
    }
}