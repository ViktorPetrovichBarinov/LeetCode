package org.example;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = mergeTwoArrays(nums1, nums2);
        int length = mergedArray.length;
        if (length % 2 == 0) {
            return ((double) mergedArray[length/2] + (double) mergedArray[length/2 - 1]) / 2;
        } else {
            return (double)mergedArray[length/2];
        }
    }

    public int[] mergeTwoArrays(int[] nums1, int[] nums2) {
        int index1 = 0;
        int index2 = 0;
        int length1 = nums1.length;
        int length2 = nums2.length;

        int[] answer = new int[length1 + length2];
        while (index1 < length1 && index2 < length2) {
            int current;
            if (nums1[index1] <= nums2[index2]) {
                current = nums1[index1];
                index1++;
            } else {
                current = nums2[index2];
                index2++;
            }
            answer[index1 + index2 - 1] = current;
        }

        if (index1 == length1) {
            while(index2 < length2) {
                answer[index1 + index2] = nums2[index2];
                index2++;
            }
        } else {
            while(index1 < length1) {
                answer[index1 + index2] = nums1[index1];
                index1++;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = new int[] {1,2};
        int[] nums2 = new int[] {3,4};
        System.out.println(sol.findMedianSortedArrays(nums1, nums2));
    }
}