package org.example;

public class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int answer = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!visited[i][j]) {
                    visited[i][j] = true;
                    if (grid[i][j] == '1') {
                        answer++;
                        visit(grid, visited, i, j);
                    }

                }
            }
        }
        return  answer;
    }

    public void visit(char[][] grid, boolean[][] visited, int i, int j) {
        boolean was;
        if (i - 1 >= 0) {
            was = visited[i - 1][j];
            visited[i - 1][j] = true;
            if (grid[i - 1][j] == '1' && !was) {
                visit(grid, visited, i - 1, j);
            }
        }
        if (j - 1 >= 0) {
            was = visited[i][j - 1];
            visited[i][j - 1] = true;
            if (grid[i][j - 1] == '1' && !was) {
                visit(grid, visited, i, j - 1);
            }
        }
        if (i + 1 < visited.length) {
            was = visited[i + 1][j];
            visited[i + 1][j] = true;
            if (grid[i + 1][j] == '1' && !was) {
                visit(grid, visited, i + 1, j);
            }
        }
        if (j + 1 < visited[0].length) {
            was = visited[i][j + 1];
            visited[i][j + 1] = true;
            if (grid[i][j + 1] == '1' && !was) {
                visit(grid, visited, i, j + 1);
            }
        }
    }


    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.numIslands(new char[][]{
                {'1', '1', '1'},
                {'0', '1', '0'},
                {'1', '1', '1'}
        }));

    }
}