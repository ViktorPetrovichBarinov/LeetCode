package org.example;

public class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int leftIndex = 0;
        int rightIndex = 0;
        long answer = 0;
        int length = nums.length;


        while(rightIndex < length) {
            int currentNumber = nums[rightIndex];
            if (currentNumber < minK || currentNumber > maxK || rightIndex == length - 1) {
                if (currentNumber < minK || currentNumber > maxK) {
                    answer += answerPart(nums, minK, maxK, leftIndex, rightIndex);
                } else {
                    answer += answerPart(nums, minK, maxK, leftIndex, rightIndex + 1);
                }
                rightIndex++;
                leftIndex = rightIndex;
                continue;
            }
            rightIndex++;
        }
        return answer;
    }

    public long answerPart(int[] nums, int min, int max, int leftIndex, int rightIndex) {
        long part = 0;
        int leftestMinIndex = findLeftestMinIndex(nums, min, leftIndex, rightIndex);
        if (leftestMinIndex == -1) {
            return 0;
        }
        int leftestMaxIndex = findLeftestMaxIndex(nums, max, leftIndex, rightIndex);
        if (leftestMaxIndex == -1) {
            return 0;
        }

        for (; leftIndex < rightIndex; leftIndex++) {
            int length = rightIndex - leftIndex;
            part += (long)length - (long)Math.max(leftestMaxIndex - leftIndex, leftestMinIndex - leftIndex);

            if (leftIndex == leftestMinIndex){
                leftestMinIndex = findLeftestMinIndex(nums, min, leftIndex + 1, rightIndex);
            }
            if (leftIndex == leftestMaxIndex) {
                leftestMaxIndex = findLeftestMaxIndex(nums, max, leftIndex + 1, rightIndex);
            }
            if (leftestMaxIndex == -1 || leftestMinIndex == -1) {
                break;
            }
        }


        return part;
    }

    public int findLeftestMinIndex(int[] nums, int min, int leftIndex, int rightIndex) {
        int leftestMinIndex = -1;
        for (int i = leftIndex; i < rightIndex; i++) {
            if (nums[i] == min) {
                leftestMinIndex = i;
                break;
            }
        }
        return leftestMinIndex;
    }

    public int findLeftestMaxIndex(int[] nums, int max, int leftIndex, int rightIndex) {
        int leftestMaxIndex = -1;
        for (int i = leftIndex; i < rightIndex; i++) {
            if (nums[i] == max) {
                leftestMaxIndex = i;
                break;
            }
        }
        return leftestMaxIndex;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1,1,1,1,5};
        int min = 1;
        int max = 1;
        Solution sol = new Solution();

        System.out.println(sol.countSubarrays(nums, min, max));
    }
}