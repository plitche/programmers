package com.company.lv1.day_230827;

// https://school.programmers.co.kr/learn/courses/30/lessons/133499
public class Q1_옹알이2_answer {

    // private static String[] babblings = {"aya", "yee", "u", "maa"};
    //private static String[] babblings = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};

    private static String[] babblings = {"yayae"};

    public static void main(String[] args) {
        int answer = 0;

        for(int i = 0; i < babblings.length; i++) {
            if(babblings[i].contains("ayaaya") || babblings[i].contains("yeye") || babblings[i].contains("woowoo") || babblings[i].contains("mama")) {
                continue;
            }

            babblings[i] = babblings[i].replace("aya", " ");
            babblings[i] = babblings[i].replace("ye", " ");
            babblings[i] = babblings[i].replace("woo", " ");
            babblings[i] = babblings[i].replace("ma", " ");
            babblings[i] = babblings[i].replace(" ", "");

            if(babblings[i].length() == 0) answer++;

        }

        System.out.println("answer = " + answer);
    }

}