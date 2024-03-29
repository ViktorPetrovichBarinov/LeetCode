package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

public class Solution {
    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                i++;
            }
        }
    }



    public static void main(String[] args) {
        int[] arr = new int[] {1,0,2,3,0,4,5,0};
        Solution sol = new Solution();
        sol.duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}