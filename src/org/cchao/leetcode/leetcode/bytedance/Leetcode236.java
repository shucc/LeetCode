package org.cchao.leetcode.leetcode.bytedance;

/**
 * @author cchen6
 * @Date on 2021/05/07
 * @Description 二叉树的最近公共祖先
 */
public class Leetcode236 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (null == root) {
            return null;
        }
        if (null == p || root == q) {
            return q;
        }
        if (null == q || root == p) {
            return p;
        }
        TreeNode leftNode = lowestCommonAncestor(root.left, p, q);
        TreeNode rightNode = lowestCommonAncestor(root.right, p, q);
        if (null == leftNode && null == rightNode) {
            return null;
        } else if (null == leftNode) {
            return rightNode;
        } else if (null == rightNode) {
            return leftNode;
        } else {
            return root;
        }
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
