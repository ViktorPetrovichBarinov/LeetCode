package org.example;

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root.val == p.val || root.val == q.val) {
            return root;
        }
        TreeNode leftBranch = lowestCommonAncestor(root.left, p, q);
        TreeNode rightBranch = lowestCommonAncestor(root.right, p, q);

        if (leftBranch != null && rightBranch != null) {
            return root;
        }
        if (leftBranch != null) {
            return leftBranch;
        }
        return rightBranch;
    }




    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.lowestCommonAncestor(new TreeNode(3, new TreeNode(5), new TreeNode(1)), new TreeNode(5), new TreeNode(1)));
    }
}