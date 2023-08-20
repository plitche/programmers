package com.company.lv1.day_230820;

//https://school.programmers.co.kr/learn/courses/30/lessons/159994
public class Q4_카드뭉치 {

    //private static String[] cards1 = {"i", "drink", "water"};
    private static String[] cards1 = {"i", "water", "drink"};
    private static String[] cards2 = {"want", "to"};
    private static String[] goal = {"i", "want", "to", "drink", "water"};

    public static void main(String[] args) {
        String answer = "Yes";

        int index1 = 0;
        int index2 = 0;
        for (int i=0; i<goal.length; i++) {
            String temp = goal[i];

            if (index1 < cards1.length && temp.equals(cards1[index1])) {
                index1++;
            } else if (index2 < cards2.length && temp.equals(cards2[index2])) {
                index2++;
            } else {
                answer = "No";
                break;
            }
        }

        System.out.println("answer = " + answer);
    }
}
