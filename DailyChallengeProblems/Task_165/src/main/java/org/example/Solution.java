package org.example;

public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int len1 = v1.length;
        int len2 = v2.length;
        for (int i = 0; i < len1 && i < len2; i++) {
            int num1 = Integer.parseInt(v1[i]);
            int num2 = Integer.parseInt(v2[i]);
            if (num1 > num2) {
                return 1;
            } else if (num1 < num2) {
                return -1;
            }
        }
        if (len1 < len2) {
            for (int i = len1; i < len2; i++) {
                int num2 = Integer.parseInt(v2[i]);
                if (num2 != 0) {
                    return -1;
                }
            }
        }
        if (len1 > len2) {
            for (int i = len2; i < len1; i++) {
                int num1 = Integer.parseInt(v1[i]);
                if (num1 != 0) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.compareVersion("0.1", "1.1"));
    }
}