package org.example;

public class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        } else {
            if (root.val >= low && root.val <= high) {
                return rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high) + root.val;
            } else {
                return rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);

            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}