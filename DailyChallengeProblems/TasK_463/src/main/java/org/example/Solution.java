package org.example;

public class Solution {
    public int islandPerimeter(int[][] grid) {
        boolean[][] isChecked = new boolean[grid.length][grid[0].length];
        int answer = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    answer += 4 - neighbourCheck(grid, i, j);
                }
            }
        }

        return answer;
    }

    public int neighbourCheck(int[][] grid, int row, int col) {
        int answer = 0;
        if (row + 1 < grid.length && grid[row + 1][col] == 1) {
            answer++;
        }
        if (row - 1 >= 0 && grid[row - 1][col] == 1) {
            answer++;
        }
        if (col + 1 < grid[0].length && grid[row][col + 1] == 1) {
            answer++;
        }
        if (col - 1 >= 0 && grid[row][col - 1] == 1) {
            answer++;
        }
        return answer;
    }
    public static void main(String[] args) {

    }
}