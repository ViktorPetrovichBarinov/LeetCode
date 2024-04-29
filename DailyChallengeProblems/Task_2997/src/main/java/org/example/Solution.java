package org.example;

public class Solution {
    public int minOperations(int[] nums, int k) {
        int result = 0;
        for (int elem : nums) {
            result ^= elem;
        }

        int answer = 0;
        for (int i = 0; i < 32; i++) {
            if (getIBit(result, i) != getIBit(k, i)) {
                answer++;
            }
        }
        return answer;
    }

    private static int getIBit(int num, int index) {
        return (num & (1 << index)) >> index;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.minOperations(new int[] {2, 1, 3, 4}, 2));
    }
}