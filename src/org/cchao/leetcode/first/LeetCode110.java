package org.cchao.leetcode.first;

/**
 * Created by shucc on 18/5/8.
 * cc@cchao.org
 */
public class LeetCode110 {

    public boolean isBalanced(TreeNode root) {
        if (null == root) {
            return true;
        }
        if (Math.abs(treeDepth(root.left) - treeDepth(root.right)) > 1) {
            return false;
        } else {
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }

    private int treeDepth(TreeNode root) {
        if (null == root) {
            return 0;
        }
        return 1 + Math.max(treeDepth(root.left), treeDepth(root.right));
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
