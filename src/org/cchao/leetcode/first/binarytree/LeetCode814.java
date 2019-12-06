package org.cchao.leetcode.first.binarytree;

/**
 * Created by shucc on 18/5/10.
 * cc@cchao.org
 * 二叉树剪枝
 */
public class LeetCode814 {

    public TreeNode pruneTree(TreeNode root) {
        return containsOne(root) ? root : null;
    }

    private boolean containsOne(TreeNode node) {
        if (node == null) {
            return false;
        }
        boolean a1 = containsOne(node.left);
        boolean a2 = containsOne(node.right);
        if (!a1) {
            node.left = null;
        }
        if (!a2) {
            node.right = null;
        }
        return node.val == 1 || a1 || a2;
    }
}
