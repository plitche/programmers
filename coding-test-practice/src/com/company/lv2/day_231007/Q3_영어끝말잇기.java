package com.company.lv2.day_231007;

import java.util.HashSet;
import java.util.Set;

// https://school.programmers.co.kr/learn/courses/30/lessons/12981
public class Q3_영어끝말잇기 {

//    private static int n = 3;
//    private static String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};

//    private static int n = 5;
//    private static String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};

    private static int n = 2;
    private static String[] words = {"hello", "one", "even", "never", "now", "world", "raw"};

    public static void main(String[] args) {
        int[] answer = new int[2];

        Set<String> set = new HashSet<>();
        int idx = 2;
        int turn = 1;
        char before = words[0].charAt(words[0].length()-1);
        set.add(words[0]);

        for (int i=1; i<words.length; i++) {
            String word = words[i];
            if (set.contains(word) || before != word.charAt(0)) {
                answer[0] = idx;
                answer[1] = turn;
                break;
            }

            before = word.charAt(word.length()-1);
            set.add(word);
            if (idx == n) {
                idx = 1;
                turn++;
            } else {
                idx++;
            }
        }


        System.out.println("answer = " + answer[0] + ":" + answer[1]);
    }

}
