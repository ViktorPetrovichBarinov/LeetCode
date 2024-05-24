package org.example;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if ((root.left == null && root.right != null) || (root.left != null && root.right == null)) {
            return false;
        }
        return isSymmetric2(root.left, root.right);
    }

    private boolean isSymmetric2(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if ((left == null && right != null) || (left != null && right == null)) {
            return false;
        }
        return left.val == right.val && isSymmetric2(left.left, right.right) && isSymmetric2(left.right, right.left);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}