package com.company.lv2.day_230925;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

// https://school.programmers.co.kr/learn/courses/30/lessons/87946
public class Q1_피로도_answer {

    private static int k = 80;
    private static int[][] dungeons = {
            {80, 20},
            {50, 40},
            {30, 10}
    };

    static boolean[] visited;
    static int count = 0;

    public static void main(String[] args) {
        visited = new boolean[dungeons.length];
        dfs(0, k, dungeons);
        System.out.println("answer = " + count);
    }

    private static void dfs(int depth, int fatigue, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            if (visited[i] || dungeons[i][0] > fatigue) {
                continue;
            }
            visited[i] = true;
            dfs(depth + 1, fatigue - dungeons[i][1], dungeons);
            visited[i] = false;
        }
        count = Math.max(count, depth);
    }
}
