package org.cchao.leetcode.bytedance;

/**
 * @author cchen6
 * @Date on 2020/7/17
 * @Description 二叉树的最近公共祖先
 */
public class ListNode08 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == p || root == q || root == null) {
            return root;
        }
        TreeNode leftNode = lowestCommonAncestor(root.left, p, q);
        TreeNode rightNode = lowestCommonAncestor(root.right, p, q);
        if (null != leftNode && null != rightNode) {
            return root;
        } else if (null == leftNode) {
            //都在右子树
            return rightNode;
        } else {
            //都在左子树
            return leftNode;
        }
    }
}
