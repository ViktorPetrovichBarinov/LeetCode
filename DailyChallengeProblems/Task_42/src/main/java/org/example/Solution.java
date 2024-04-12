package org.example;

import java.util.Arrays;

public class Solution {

    public int trap(int[] height) {
        int length = height.length;
        int firstElement = height[0];
        int firstIndex = 0;
        int maxElement = -1;
        int maxElementIndex = -2;
        int maxElementSum = 0;
        int currentSum = 0;
        int answer = 0;
        for (int i = 1; i < length; i++) {
            if (i != firstIndex + 1) {
                if (height[i] >= firstElement) {
                    answer += currentSum;
                    currentSum = 0;
                    firstElement = height[i];
                    firstIndex = i;
                    maxElement = -1;
                    maxElementIndex = -1;
                    continue;
                } else {
                    currentSum += firstElement - height[i];
                    if (height[i] > maxElement) {
                        maxElement = height[i];
                        maxElementIndex = i;
                        maxElementSum = currentSum;
                    }
                }
            } else {
                if (height[i] > firstElement) {
                    firstElement = height[i];
                    firstIndex = i;
                } else {
                    currentSum += firstElement - height[i];
                    if (height[i] > maxElement) {
                        maxElement = height[i];
                        maxElementIndex = i;
                        maxElementSum = currentSum;
                    }
                }
            }

            if (i == length - 1 && currentSum != 0) {
                answer += maxElementSum - (firstElement - maxElement) * (maxElementIndex - firstIndex);
                firstElement = maxElement;
                firstIndex = maxElementIndex;
                i = firstIndex;
                currentSum = 0;
                maxElementIndex = -1;
                maxElement = -1;
                maxElementSum = 0;

                if (i == -2) {
                    return  0;
                }
            }
        }
        return answer;
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