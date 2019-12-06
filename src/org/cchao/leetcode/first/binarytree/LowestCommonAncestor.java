package org.cchao.leetcode.first.binarytree;

/**
 * Created by shucc on 18/5/8.
 * cc@cchao.org
 * 给定一棵二叉树, 找到该树中两个指定节点的最近公共祖先
 */
public class LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (null == root) {
            return null;
        }
        if (p == root || q == root) {
            return root;
        }
        TreeNode leftNode = lowestCommonAncestor(root.left, p, q);
        TreeNode rightNode = lowestCommonAncestor(root.right, p, q);
        if (null != leftNode && null != rightNode) {
            return root;
        }
        if (null == leftNode && null == rightNode) {
            return null;
        }
        return null != leftNode ? leftNode : rightNode;
    }
}
