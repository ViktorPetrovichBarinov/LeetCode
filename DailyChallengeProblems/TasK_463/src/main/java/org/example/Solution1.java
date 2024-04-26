package org.example;

public class Solution1 {
    public int islandPerimeter(int[][] grid) {
        int answer = 0;
        for (int i = 0; i < grid.length - 1; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if ((grid[i][j] == 1 && grid[i + 1][j] == 0)
                        ||  (grid[i][j] == 0 && grid[i + 1][j] == 1)) {
                    answer++;
                }
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length - 1; j++) {
                if ((grid[i][j] == 1 && grid[i][j + 1] == 0) ||
                (grid[i][j] == 0 && grid[i][j + 1] == 1)) {
                    answer++;
                }
            }
        }
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][0] == 1) {
                answer++;
            }
            if (grid[i][grid[0].length - 1] == 1) {
                answer++;
            }
        }
        for (int j = 0; j < grid[0].length; j++) {
            if (grid[0][j] == 1) {
                answer++;
            }
            if (grid[grid.length - 1][j] == 1) {
                answer++;
            }
        }

        return answer;
    }
}
