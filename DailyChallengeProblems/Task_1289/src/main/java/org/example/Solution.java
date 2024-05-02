package org.example;

import java.util.Arrays;

public class Solution {
    public int minFallingPathSum(int[][] grid) {
        int length = grid.length;
        int[][] dynamic = new int[length][length];

        for (int i = 0; i < length; i++) {
            dynamic[0][i] = grid[0][i];
        }

        for (int i = 1; i < length; i++) {
            Arrays.fill(dynamic[i], Integer.MAX_VALUE);
        }


        for (int i = 1; i < length; i++) {
            for (int j = 0; j < length; j++) {
                for (int k = 0; k < length; k++) {
                    if (k != j) {
                        dynamic[i][j] = Math.min(dynamic[i][j], grid[i][j] + dynamic[i - 1][k]);
                    }
                }
            }
        }

        int answer = Integer.MAX_VALUE;
        for (int elem : dynamic[length - 1]) {
            answer = Math.min(answer, elem);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}