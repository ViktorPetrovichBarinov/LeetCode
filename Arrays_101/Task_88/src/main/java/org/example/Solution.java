package org.example;

import java.util.Arrays;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] clone1 = nums1.clone();
        int index1 = 0;
        int index2 = 0;
        int length = nums1.length;
        for (int i = 0; i < length; i++) {
            if (index1 == m) {
                nums1[i] = nums2[index2++];
            } else if (index2 == n) {
                nums1[i] = clone1[index1++];
            } else {
                if (clone1[index1] < nums2[index2]) {
                    nums1[i] = clone1[index1++];
                } else {
                    nums1[i] = nums2[index2++];
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] nums1 = new int[] {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int[] {2,5,6};
        int n = 3;
        Solution sol = new Solution();
        sol.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}