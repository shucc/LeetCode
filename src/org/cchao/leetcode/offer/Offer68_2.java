package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/3/6
 * @Description 二叉树的最近公共祖先
 */
public class Offer68_2 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (null == root || root == p || root == q) {
            return root;
        }
        TreeNode leftNode = lowestCommonAncestor(root.left, p, q);
        TreeNode rightNode = lowestCommonAncestor(root.right, p, q);
        if (leftNode == null) {
            return rightNode;
        }
        if (null == rightNode) {
            return leftNode;
        }
        return root;
    }

    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        if (null == root || root == p || root == q) {
            return root;
        }
        TreeNode leftNode = lowestCommonAncestor2(root.left, p, q);
        TreeNode rightNode = lowestCommonAncestor2(root.right, p, q);
        if (null == leftNode) {
            return rightNode;
        }
        if (null == rightNode) {
            return leftNode;
        }
        return root;
    }
}
