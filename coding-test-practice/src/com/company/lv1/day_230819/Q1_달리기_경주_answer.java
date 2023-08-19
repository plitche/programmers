package com.company.lv1.day_230819;

import java.util.HashMap;

// https://school.programmers.co.kr/learn/courses/30/lessons/178871?language=java
public class Q1_달리기_경주_answer {

    private static String[] players = {"mumu", "soe", "poe", "kai", "mine"};
    private static String[] callings = {"kai", "kai", "mine", "mine"};

    public static void main(String[] args) {
        HashMap<String, Integer> playerMap = new HashMap<>();
        HashMap<Integer, String> rankMap = new HashMap<>();

        // 맵 초기화
        for (int i = 0; i < players.length; i++) {
            playerMap.put(players[i], i);
            rankMap.put(i, players[i]);
        }

        for (int i = 0; i < callings.length; i++) {
            int currentRank = playerMap.get(callings[i]); // 추월한 유저 순위
            String player = rankMap.get(currentRank); // 추월한 유저 이름

            // 바로 앞 플레이어
            String frontPlayer = rankMap.get(currentRank - 1);

            // swap
            playerMap.put(player, currentRank - 1);
            playerMap.put(frontPlayer, currentRank);

            rankMap.put(currentRank - 1, player);
            rankMap.put(currentRank, frontPlayer);
        }

        for (int i = 0; i < players.length; i++) {
            players[i] = rankMap.get(i);
        }

        for (String player : players) {
            System.out.print(player + " ");
        }
    }
}
