package org.cchao.leetcode.leetcode.bytedance;

/**
 * @author cchen6
 * @Date on 2021/05/12
 * @Description 路径总和
 */
public class Leetcode112 {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root, 0, targetSum);
    }

    private boolean dfs(TreeNode root, int sum, int targetSum) {
        if (null == root) {
            return false;
        }
        sum += root.val;
        if (sum == targetSum && root.left == null && root.right == null) {
            return true;
        }
        if (dfs(root.left, sum, targetSum)) {
            return true;
        }
        return dfs(root.right, sum, targetSum);
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
