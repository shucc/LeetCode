package org.cchao.leetcode.hot100;

public class LeetCode10_538 {

    int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        if (null == root) {
            return null;
        }
        convertBST(root.right);
        sum += root.val;
        root.val = sum;
        convertBST(root.left);
        return root;
    }
}
