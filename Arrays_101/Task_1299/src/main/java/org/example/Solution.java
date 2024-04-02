package org.example;

import java.util.Arrays;

public class Solution {
    public int[] replaceElements(int[] arr) {
        int length = arr.length;
        int[] rightMaxElement = new int[length];
        rightMaxElement[length - 1] = -1;
        for (int i = length - 2; i >= 0; i--) {
            rightMaxElement[i] = Math.max(rightMaxElement[i + 1], arr[i + 1]);
        }
        return rightMaxElement;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.replaceElements(new int[]{400})));
    }
}