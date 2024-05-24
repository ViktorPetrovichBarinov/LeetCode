package org.example;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int HIST_LENGTH = 1002;
        int[] hist1 = new int[HIST_LENGTH];
        int[] hist2 = new int[HIST_LENGTH];
        for(int i = 0; i < nums1.length; i++) {
            hist1[nums1[i]]++;
        }

        for(int i = 0; i < nums2.length; i++) {
            hist2[nums2[i]]++;
        }

        int[] answer1 = new int[HIST_LENGTH];
        int index = 0;
        for(int i = 0; i < HIST_LENGTH; i++) {
            for (int j = 0; j < Math.min(hist1[i], hist2[i]); j++) {
                answer1[index++] = i;
            }
        }
        int[] answer = new int[index];
        System.arraycopy(answer1, 0, answer, 0, index);
        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.intersect(new int[]{1,2,2,1}, new int[]{2,2});
    }
}