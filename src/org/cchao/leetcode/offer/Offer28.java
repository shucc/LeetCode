package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/3/11
 * @Description 对称的二叉树
 */
public class Offer28 {

    private boolean hasLeftRight(TreeNode root) {
        if (null == root) {
            return true;
        }
        boolean left = hasLeftRight(root.left);
        boolean right = hasLeftRight(root.right);
        return left && right;
    }
}
