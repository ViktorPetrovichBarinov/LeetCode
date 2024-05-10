package org.example;


public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix[0].length * matrix.length - 1;
        int col = matrix[0].length;
        while(left <= right) {
            int middle = (left + right) / 2;
            int element = matrix[middle / col][middle % col];
            if (element == target) {
                return true;
            } else if (element < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] matrix = new int[3][4];
        matrix[0] = new int[] {1,3,5,7};
        matrix[1] = new int[] {10,11,16,20};
        matrix[2] = new int[] {23,30,34,60};
        System.out.println(sol.searchMatrix(matrix, 3));
    }
}