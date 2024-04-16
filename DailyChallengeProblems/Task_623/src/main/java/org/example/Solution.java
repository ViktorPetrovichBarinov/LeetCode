package org.example;

import javax.swing.tree.TreeCellRenderer;

public class Solution {

    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        } else {
            search(root, val, depth, 1);
        }
        return root;
    }

    public void search(TreeNode root, int val, int depth, int currentDepth) {
        if (currentDepth == depth - 1) {
            TreeNode left = root.left;
            TreeNode right = root.right;
            TreeNode newLeft = new TreeNode(val);
            TreeNode newRight = new TreeNode(val);
            newLeft.left = left;
            newRight.right = right;
            root.left = newLeft;
            root.right = newRight;
            return;
        } else {
            if (root.left != null) {
                search(root.left, val, depth, currentDepth+1);
            }
            if (root.right != null) {
                search(root.right, val, depth, currentDepth + 1);
            }

        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        TreeNode root = new TreeNode(4);
        TreeNode left = new TreeNode(2);
        left.left = new TreeNode(3);
        left.right = new TreeNode(1);
        //TreeNode right = new TreeNode(6);
        //right.left = new TreeNode(5);
        root.left = left;
        //root.right= right;

        sol.addOneRow(root, 1, 3);
    }
}