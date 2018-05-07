package org.cchao.leetcode.binarytree;

/**
 * Created by shucc on 18/5/7.
 * cc@cchao.org
 * 路径总和
 */
public class HasPathSum {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (null == root) {
            return false;
        }
        return childHasPathSum(root.left, root.right, sum, root.val);
    }

    private boolean childHasPathSum(TreeNode leftNode, TreeNode rightNode, int sum, int rootVal) {
        if (null == leftNode && null == rightNode) {
            return rootVal == sum;
        }
        if (null == leftNode) {
            return childHasPathSum(rightNode.left, rightNode.right, sum, rootVal + rightNode.val);
        }
        if (null == rightNode) {
            return childHasPathSum(leftNode.left, leftNode.right, sum, rootVal + leftNode.val);
        }
        return childHasPathSum(rightNode.left, rightNode.right, sum, rootVal + rightNode.val) || childHasPathSum(leftNode.left, leftNode.right, sum, rootVal + leftNode.val);
    }
}
