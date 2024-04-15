package org.example;

public class Solution {
    int summary;
    public int sumNumbers(TreeNode root) {
        summary = 0;
        String start = String.valueOf(root.val);

        if (root.left == null && root.right == null) {
            summary += root.val;
        }
        if (root.left != null) {
            pathToLeaf(start, root.left);
        }
        if (root.right != null) {
            pathToLeaf(start, root.right);
        }

        int answer = summary;
        summary = 0;
        return answer;
    }

    public void pathToLeaf(String currentString, TreeNode root) {
        if (root.left == null && root.right == null) {
            summary += Integer.parseInt(currentString + String.valueOf(root.val));
            return;
        }
        if (root.left != null) {
            pathToLeaf(currentString + String.valueOf(root.val), root.left);
        }
        if (root.right != null) {
            pathToLeaf(currentString + String.valueOf(root.val), root.right);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;

        Solution sol = new Solution();
        System.out.println(sol.sumNumbers(root));
    }
}