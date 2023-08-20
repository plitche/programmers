package com.company.lv1.day_230820;

//https://school.programmers.co.kr/learn/courses/30/lessons/159994
public class Q4_카드뭉치_dfs {

    //private static String[] cards1 = {"i", "drink", "water"};
    private static String[] cards1 = {"i", "water", "drink"};
    private static String[] cards2 = {"want", "to"};
    private static String[] goal = {"i", "want", "to", "drink", "water"};

    public static void main(String[] args) {
        String answer = "";

        if (dfs(cards1, cards2, goal, 0, 0, 0)) {
            answer = "Yes";
        } else {
            answer = "No";
        }

        System.out.println("answer = " + answer);
    }

    public static boolean dfs(String[] cards1, String[] cards2, String[] goal, int left, int right, int target) {
        if (target == goal.length) {
            return true;
        }

        if (left < cards1.length && goal[target].equals(cards1[left])) {
            return dfs(cards1, cards2, goal, left + 1, right, target + 1);
        }
        if (right < cards2.length && goal[target].equals(cards2[right])) {
            return dfs(cards1, cards2, goal, left, right + 1, target + 1);
        }
        return false;
    }

}
