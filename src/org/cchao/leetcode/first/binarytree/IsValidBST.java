package org.cchao.leetcode.first.binarytree;

/**
 * Created by shucc on 18/5/14.
 * cc@cchao.org
 * 判断是否为二叉搜索树
 */
public class IsValidBST {

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }

    private boolean isValidBST(TreeNode root, long max, long min) {
        if (root == null) {
            return true;
        }
        if (root.val <= min || root.val >= max) {
            return false;
        }
        if (root.left != null && root.val <= root.left.val) {
            return false;
        }
        if (root.right != null && root.val >= root.right.val) {
            return false;
        }
        return (root.left == null ? true : isValidBST(root.left, root.val, min)) && (root.right == null ? true : isValidBST(root.right, max, root.val));
    }
}
