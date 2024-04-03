package org.example;

import java.lang.reflect.Parameter;
import java.util.Arrays;

public class Solution {
    public boolean exist(char[][] board, String word) {
        int height = board.length;
        int weight = board[0].length;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < weight; j++) {
                if (checkCurrentSymbol(board, word, i, j, 0)) {
                    return true;
                }

            }
        }
        return false;
    }

    public boolean checkCurrentSymbol(char[][] board, String word, int y, int x, int index) {
        int height = board.length;
        int weight = board[0].length;

        if (board[y][x] == word.charAt(index)) {
            if (word.length() == index + 1) {
                return true;
            }
            char[][] boardCopy = new char[height][weight];
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < weight; j++) {
                    boardCopy[i][j] = board[i][j];
                }
            }
            boardCopy[y][x] = 1;
            boolean up = false;
            boolean right = false;
            boolean down = false;
            boolean left = false;
            if (y > 0) {
                up = checkCurrentSymbol(boardCopy, word, y - 1, x, index + 1);
            }
            if (x > 0) {
                left = checkCurrentSymbol(boardCopy, word, y, x - 1, index + 1);
            }
            if (y < height - 1) {
                down = checkCurrentSymbol(boardCopy, word, y + 1, x, index + 1);
            }
            if (x < weight - 1) {
                right = checkCurrentSymbol(boardCopy, word, y, x + 1, index + 1);
            }
            return up || left || down || right;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        char[][] board = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        char[][] board1 = new char[][]{{'A'}};
        char[][] board2 = new char[][]{{'C', 'A', 'A'}, {'A', 'A', 'A'}, {'B', 'C', 'D'}};
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(board2[i]));
        }

        Solution sol = new Solution();
        String word = "AAB";
        System.out.println(sol.exist(board2, word));
    }
}