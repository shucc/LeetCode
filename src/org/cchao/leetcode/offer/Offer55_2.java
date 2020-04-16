package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/3/10
 * @Description 平衡二叉树
 */
public class Offer55_2 {
    public boolean isBalanced(TreeNode root) {
        if (null == root) {
            return true;
        }
        if (Math.abs(getChildDeep(root.left) - getChildDeep(root.right)) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int getChildDeep(TreeNode root) {
        if (null == root) {
            return 0;
        }
        int left = getChildDeep(root.left);
        int right = getChildDeep(root.right);
        return Math.max(left, right) + 1;
    }
}
