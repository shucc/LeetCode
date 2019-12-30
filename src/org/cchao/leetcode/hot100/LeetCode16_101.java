package org.cchao.leetcode.hot100;

public class LeetCode16_101 {
    public boolean isSymmetric(TreeNode root) {
        if (null == root) {
            return true;
        }
        return childSymmetric(root.left, root.right);
    }

    private boolean childSymmetric(TreeNode leftNode, TreeNode rightNode) {
        if (null == leftNode && null == rightNode) {
            return true;
        }
        if (null == leftNode || null == rightNode) {
            return false;
        }
        if (leftNode.val == rightNode.val) {
            return childSymmetric(leftNode.left, rightNode.right) && childSymmetric(leftNode.right, rightNode.left);
        }
        return false;
    }
}
