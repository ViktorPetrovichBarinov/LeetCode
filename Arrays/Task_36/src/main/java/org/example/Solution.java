package org.example;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] subBoxes = new boolean[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                int number = c - '1';
                if (number < 0 || number > 9) {
                    continue;
                }
                if (col[j][number]) {
                    return false;
                } else {
                    col[j][number] = true;
                }
                if (row[i][number]) {
                    return false;
                } else {
                    row[i][number] = true;
                }
                int subBoxesIndex = i / 3 * 3 + j / 3;
                if (subBoxes[subBoxesIndex][number]) {
                    return false;
                } else {
                    subBoxes[subBoxesIndex][number] = true;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();

        char[][] sudoku1 = new char[][] {
                {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println(sol.isValidSudoku(sudoku1));
    }
}