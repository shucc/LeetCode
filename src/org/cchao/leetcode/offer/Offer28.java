package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/3/11
 * @Description 对称的二叉树
 */
public class Offer28 {

    public boolean isSymmetric(TreeNode root) {
        if (null == root) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode leftNode, TreeNode rightNode) {
        if (null == leftNode && null == rightNode) {
            return true;
        }
        if (null == leftNode || null == rightNode) {
            return false;
        }
        if (leftNode.val != rightNode.val) {
            return false;
        }
        return isSymmetric(leftNode.left, rightNode.right) && isSymmetric(leftNode.right, rightNode.left);
    }
}
