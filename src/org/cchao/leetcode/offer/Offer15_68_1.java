package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/3/5
 * @Description 二叉搜索树的最近公共祖先
 */
public class Offer15_68_1 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }

    private TreeNode process(TreeNode root, TreeNode minNode, TreeNode maxNode) {
        if (null == root) {
            return null;
        }
        if (null == minNode) {
            return maxNode;
        }
        if (null == maxNode) {
            return minNode;
        }
        if (minNode.val <= root.val && maxNode.val >= root.val) {
            return root;
        }
        if (maxNode.val < root.val) {
            return process(root.left, minNode, maxNode);
        }
        return process(root.right, minNode, maxNode);
    }
}
