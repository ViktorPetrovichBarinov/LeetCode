package org.example;

public class Solution {

////Решение за квадрат, не прошло по времени
//    public long countSubarrays(int[] nums, int k) {
//        int answer = 0;
//        int length = nums.length;
//        for (int i = 0; i < length; i++) {
//            int max = getMaximum(nums);
//            int maximumCounter = 0;
//            for (int j = i; j < length; j++) {
//                if (nums[j] == max) {
//                    maximumCounter++;
//                    if (maximumCounter == k) {
//                        answer += length - j;
//                        break;
//                    }
//                }
//            }
//        }
//        return answer;
//    }

    public long countSubarrays(int[] nums, int k) {
        long answer = 0;
        int length = nums.length;
        int left = 0;
        int right = 0;
        int currentCountOfMaximum = 0;
        int maximum = getMaximum(nums);
        while(right < length) {
            if (nums[right] == maximum) {
                currentCountOfMaximum++;
                if(currentCountOfMaximum == k) {
                    answer += length - right;
                    while(nums[left] != maximum) {
                        answer += length - right;
                        left++;
                    }
                    left++;
                    currentCountOfMaximum--;
                }
            }
            right++;
        }
        return answer;
    }

    public int getMaximum(int[] nums) {
        int maximum = 0;
        for (int i = 0; i < nums.length; i++) {
            maximum = Math.max(maximum, nums[i]);
        }
        return maximum;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.countSubarrays(new int[]{1,4,2,1}, 3));
    }
}