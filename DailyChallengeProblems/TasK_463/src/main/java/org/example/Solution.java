package org.example;

public class Solution {
    public int islandPerimeter(int[][] grid) {
        int answer = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        int previous = 0;
        for (int i = 0; i < rows; i++) {
            previous = 0;
            for (int j = 0; j < cols; j++) {
                answer += previous ^ grid[i][j];
                previous = grid[i][j];
            }
            answer += previous;
        }


        for (int i = 0; i < cols; i++) {
            previous = 0;
            for (int j = 0; j < rows; j++) {
                answer += previous ^ grid[j][i];
                previous = grid[j][i];
            }
            answer += previous;
        }


        return answer;
    }

    
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] nums = new int[][]{
                {0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0}
        };
        sol.islandPerimeter(nums);
    }
}