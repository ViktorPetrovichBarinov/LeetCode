package org.example;

public class Solution {
    public int numSquares(int n) {
        if (n == 0) {
            return 0;
        }

        int[] data = new int[n + 3];
        for (int i = 0; i < n + 3; i++) {
            data[i] = -1;
        }
        return rekursive(n, data);
    }

    private int rekursive(int n, int[] data) {
        if (n == 0) {
            return 0;
        }

        int counter = Integer.MAX_VALUE;
        for (int i = 1; i * i <= n; i++) {
            if (data[n - i * i] == -1) {
                data[n - i * i] = rekursive(n - i * i, data);
            }
            counter = Math.min(counter, data[n - i * i] + 1);
        }
        return counter;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        for (int i = 1; i < 100; i++) {
            System.out.println(i + " " + sol.numSquares(i));
        }

    }
}