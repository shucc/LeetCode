package org.cchao.leetcode.binarytree;

/**
 * Created by shucc on 18/5/7.
 * cc@cchao.org
 * 判断是否为对称二叉树
 */
public class IsSymmetric {

    public boolean isSymmetric(TreeNode root) {
        if (null == root) {
            return true;
        }
        return childSymmetric(root.left, root.right);
    }

    private boolean childSymmetric(TreeNode leftNode, TreeNode rightNode) {
        //左右子树都为空，是对称
        if (null == leftNode && null == rightNode) {
            return true;
        }
        //左右子树一个为空，一个不为空，不对称
        if (null == leftNode || null == rightNode) {
            return false;
        }
        //左右子树的值相等，判断左子树的左结点与右子树的右结点，左子树的右结点与右子树的左结点
        if (leftNode.val == rightNode.val) {
            return childSymmetric(leftNode.left, rightNode.right) && childSymmetric(leftNode.right, rightNode.left);
        }
        return false;
    }
}
