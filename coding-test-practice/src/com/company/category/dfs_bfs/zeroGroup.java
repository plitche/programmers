package com.company.category.dfs_bfs;

/**
 * author         : yskwon
 * date           : 2023-08-18
 * title          :
 * Level          :
 * isSolved       :
 * url            :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-08-18        yskwon       최초 생성
 */
public class zeroGroup {

    public static void main(String[] args) {
        int[][] arr = {
                {0, 0, 1, 1, 0},
                {0, 0, 0, 1, 1},
                {0, 0, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0},
        };

        int rows = arr.length;
        int cols = arr[0].length;

        boolean[][] visited = new boolean[rows][cols];

        int zeroGroupsCount = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == 0 && !visited[i][j]) {
                    dfs(arr, visited, i, j);
                    zeroGroupsCount++;
                }
            }
        }

        System.out.println("Number of zero groups: " + zeroGroupsCount);
    }

    private static void dfs(int[][] arr, boolean[][] visited, int row, int col) {
        int rows = arr.length;
        int cols = arr[0].length;

        if (row < 0 || row >= rows || col < 0 || col >= cols || arr[row][col] == 1 || visited[row][col]) {
            return;
        }

        visited[row][col] = true;

        // Check neighboring cells
        dfs(arr, visited, row - 1, col);
        dfs(arr, visited, row + 1, col);
        dfs(arr, visited, row, col - 1);
        dfs(arr, visited, row, col + 1);
    }
}
