package com.company.lv1.day_230827;

// https://school.programmers.co.kr/learn/courses/30/lessons/133499
public class Q1_옹알이2 {

    // private static String[] babbling = {"aya", "yee", "u", "maa"};
    //private static String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};

    private static String[] babbling = {"yayae"};

    public static void main(String[] args) {
        int answer = 0;

        for (int i=0; i<babbling.length; i++) {
            String check = check(babbling[i], 0);
            if(check.equals("")) answer++;
        }

        System.out.println("answer = " + answer);
    }

    public static String check(String text, int last) {
        String[] arr = {"aya", "ye", "woo", "ma"};

        for (int i=0; i<arr.length; i++) {
            String temp = arr[i];

            int idx = text.indexOf(temp);
            while(idx != -1) {
                text = text.replaceFirst(arr[i], "0");
                int idx2 = text.indexOf(temp);

                if (idx+1 == idx2) {
                    text = text.replaceFirst(arr[i], "1");
                }

                idx = idx2;
            }
        }

        return text.replace("0", "");
    }

}