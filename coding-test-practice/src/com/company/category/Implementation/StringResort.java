package com.company.category.Implementation;

// 알파벳 대문자와 숫자(0~9)로만 구성된 문자열이 입력으로 주어진다.
// 모든 알파벳을 오름차순으로 정렬하여 이어서 출력한 뒤에, 그 뒤에 모든 숫자를 더한 값을 이어서 출력한다.
// K1KA5CB7 -> ABCKK13

import java.util.Arrays;
import java.util.Scanner;

public class StringResort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] split = s.split("");
        Arrays.sort(split);

        String result = "";
        int sum = 0;
        for (int i=0; i<split.length; i++) {
            String temp = split[i];

            if (temp.charAt(0) > '9') {
                result += temp;
            } else {
                sum += temp.charAt(0) - '0';
            }
        }

        if (sum > 0) {
            result += sum;
        }
        System.out.println(result);
    }
}
