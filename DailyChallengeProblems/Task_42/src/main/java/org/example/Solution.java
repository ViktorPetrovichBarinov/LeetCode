package org.example;

import java.util.Arrays;

public class Solution {

    public int trap(int[] height) {
        int length = height.length;
        int left = 0;
        int right = 0;
        int answer = 0;
        while (left < length) {
            if (height[left] <= height[right]) {
                answer += (right - left) * (height[right] - height[left]);
                left = right;
                right++;
            }
        }
    }




    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] array1 = new int[] {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] array2 = new int[] {4,2,0,3,2,5};
        int[] array3 = new int[] {2,3,2,6,9};
        //System.out.println("arr1: " + Arrays.toString(array1));
        //System.out.println("answer: " + sol.trap(array1));
        //System.out.println("arr2: " + Arrays.toString(array2));
        //System.out.println("answer: " + sol.trap(array2));
        System.out.println("arr3: " + Arrays.toString(array3));
        System.out.println("answer: " + sol.trap(array3));
    }
}