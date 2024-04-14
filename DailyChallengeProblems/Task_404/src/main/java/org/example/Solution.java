package org.example;

import com.sun.source.tree.Tree;

public class Solution {


    public int sumOfLeftLeaves(TreeNode root) {
        return sum(root.left, true) + sum (root.right, false);
    }

    public int sum(TreeNode current, boolean isLeft) {
        if (current == null) return 0;
        if (current.left == null && current.right == null) {
            if (isLeft) {
                return current.val;
            }
            return 0;
        }
        int leftChild = 0;
        int rightChild = 0;
        if (current.left != null) {
            leftChild = sum(current.left, true);
        }
        if (current.right != null) {
            rightChild = sum(current.right, false);
        }

        return leftChild + rightChild;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        right.left = new TreeNode(15);
        right.right = new TreeNode(7);
        root.right = right;
        Solution sol = new Solution();
        System.out.println(sol.sumOfLeftLeaves(root));
    }
}