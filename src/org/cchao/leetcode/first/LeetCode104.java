package org.cchao.leetcode.first;

/**
 * Created by shucc on 18/4/4.
 * cc@cchao.org
 */
public class LeetCode104 {

    public static void main(String args[]) {

    }

    public static int maxDepth(TreeNode root) {
        if (null == root) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return 1 + (leftDepth > rightDepth ? leftDepth : rightDepth);
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
