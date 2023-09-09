package com.company.lv1.day_230909;

// https://school.programmers.co.kr/learn/courses/30/lessons/17681
public class Q1_비밀지도 {

    private static int[] arr;

//    private static int n = 5;
//    private static int[] arr1 = {9, 20, 28, 18, 11};
//    private static int[] arr2 = {30, 1, 21, 17, 28};

    private static int n = 6;
    private static int[] arr1 = {46, 33, 33, 22, 31, 50};
    private static int[] arr2 = {27, 56, 19, 14, 14, 10};

    public static void main(String[] args) {
        String[] answer = new String[n];

        String temp = "";
        for (int i=0; i<n; i++) {
            StringBuilder sb = new StringBuilder();

            arr = new int[n]; // 배열 초기화
            String change = change(arr1[i], arr2[i]); // 벽 합치기
            for (int j=change.length()-1; j>=0; j--) { // 벽 판단하기
                if (change.charAt(j) > '0') {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }

            answer[i] = sb.toString(); // 앞뒤 공백 제거후 저장
        }

        for (String s : answer) {
            System.out.println(s);
        }
    }

    public static String change(int a, int b) {
        StringBuilder sb = new StringBuilder();

        int idx = 0;
        while(a != 0) {
            arr[idx] += a%2;
            a /= 2;
            idx += 1;
        }

        idx = 0;
        while(b != 0) {
            arr[idx] += b%2;
            b /= 2;
            idx += 1;
        }

        for (int i=0; i<arr.length; i++) {
            sb.append(arr[i]);
        }

        return sb.toString();
    }
}