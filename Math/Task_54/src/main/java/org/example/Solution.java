package org.example;


import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>(matrix.length * matrix[0].length);
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        int col = 0;
        int row = 0;
        int dir = 0;// 0 - right | 1 - down | 2 - left | 3 - up
        int counter = 0;
        while(counter < matrix.length * matrix[0].length) {
            if (visited[row][col]) {
                if (dir == 0) {
                    if (col != matrix[0].length - 1 && !visited[row][col + 1]) {
                        col++;
                    } else {
                        dir = 1;
                    }
                }
                if (dir == 1) {
                    if (row != matrix.length - 1 && !visited[row + 1][col]) {
                        row++;
                    } else {
                        dir = 2;
                    }
                }
                if (dir == 2) {
                    if (col != 0 && !visited[row][col - 1]) {
                        col--;
                    } else {
                        dir = 3;
                    }
                }
                if (dir == 3) {
                    if (row != 0 && !visited[row - 1][col]) {
                        row--;
                    } else {
                        dir = 0;
                    }
                }
            } else {
                visited[row][col] = true;
                counter++;
                res.add(matrix[row][col]);
            }

        }

        return res;
    }


    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Solution sol = new Solution();
        System.out.println(sol.spiralOrder(matrix));
    }
}