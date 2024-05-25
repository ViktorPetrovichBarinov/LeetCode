package org.example;

public class Solution {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!isValidLeft(root.left, root.val) || !isValidRight(root.right, root.val)
        || !isValidBST(root.left) || !isValidBST(root.right)) {
            return false;
        }

        return true;
    }

    private boolean isValidRight(TreeNode root, int rootVal) {
        if (root == null) {
            return true;
        }
        if (root.val > rootVal) {
            if (!isValidRight(root.left, rootVal) || !isValidRight(root.right, rootVal)) {
                return false;
            }
        } else {
            return false;
        }
        return true;
    }

    private boolean isValidLeft(TreeNode root, int rootVal) {
        if (root == null) {
            return true;
        }
        if (root.val < rootVal) {
            if (!isValidLeft(root.left, rootVal) || !isValidLeft(root.right, rootVal)) {
                return false;
            }
        } else {
            return false;
        }
        return true;
    }




    public static void main(String[] args){
        Solution sol = new Solution();
        System.out.println(sol.isValidBST(new TreeNode(32, new TreeNode(26), new TreeNode(47))));
    }
}