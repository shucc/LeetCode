package org.cchao.leetcode.hot100;

/**
 * @author cchen6
 * @Date on 2020/1/10
 * @Description
 */
public class LeetCode32_114 {
    public void flatten(TreeNode root) {
        if (null == root) {
            return;
        }
        flatten(root.left);
        flatten(root.right);
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = null;
        while (root.right != null) {
            root = root.right;
        }
        root.right = temp;
    }
}
