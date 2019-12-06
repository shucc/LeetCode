package org.cchao.leetcode.first;

/**
 * Created by shucc on 18/4/11.
 * cc@cchao.org
 */
public class LeetCode226 {

    public static void main(String args[]) {

    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}



 
