package org.cchao.leetcode.hot100;

public class LeetCode3_226 {

    public TreeNode invertTree(TreeNode root) {
        if (null == root) {
            return null;
        }
        TreeNode temp = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = temp;
        return root;
    }

    public static void main(String[] args) {

    }
}
