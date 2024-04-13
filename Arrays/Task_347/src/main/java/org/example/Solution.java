package org.example;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int length = nums.length;
        int[] answer = new int[k];
        int[] anagram = new int[length];
        for (int elem : nums) {
            anagram[elem]++;
        }
        for (int i = 0; i < k; i++){
            anagram[i] =
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}