package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    ArrayList<String> Strings = new ArrayList<>();

    public String smallestFromLeaf(TreeNode root) {
        String rootStr = "" + (char)(root.val + 'a');
        if (root.left == null && root.right == null) {
            return rootStr;
        } else {
            if (root.left != null) {
                generateStrings(root.left, (char) (root.left.val + 'a') + rootStr);
            }
            if (root.right != null) {
                generateStrings(root.right, (char) (root.right.val + 'a') + rootStr);
            }
        }

//        int minStringLength = Integer.MAX_VALUE;
//        for (String s : Strings) {
//            minStringLength = Math.min(minStringLength, s.length());
//        }
//        for (int i = 0; i < Strings.size(); i++) {
//            if (Strings.get(i).length() != minStringLength) {
//                Strings.remove(i);
//                i--;
//            }
//        }

        Collections.sort(Strings);
        return Strings.getFirst();
    }

    public void generateStrings(TreeNode root, String str) {
        if (root.left == null && root.right == null) {
            Strings.add(str);
        } else {
            if (root.left != null) {
                generateStrings(root.left, (char)(root.left.val + 'a') + str);
            }
            if (root.right != null) {
                generateStrings(root.right, (char)(root.right.val + 'a') + str);
            }
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        TreeNode root = new TreeNode(3);
        TreeNode left = new TreeNode(9);
        TreeNode right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        root.left = left;
        root.right = right;
        System.out.println(sol.smallestFromLeaf(root));
    }
}