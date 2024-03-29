package org.example;

public class Solution {


    public boolean validMountainArray(int[] arr) {
        boolean isUp = true;

        int length = arr.length;
        if (length < 3) {
            return false;
        }
        for (int i = 1; i < length; i++) {
            if (isUp) {
                if (arr[i] < arr[i - 1]) {
                    if (i == 1) {
                        return false;
                    }
                    isUp = false;
                } else if (arr[i] == arr[i - 1]) {
                    return false;
                }
            } else {
                if (arr[i] >= arr[i - 1]) {
                    return false;
                }
            }

        }

        return !isUp;
    }


    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = new int[]{0,3,2,1};
        System.out.println(sol.validMountainArray(nums));
    }
}