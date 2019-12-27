package org.cchao.leetcode.hot100;

public class LeetCode12_437 {


    public int pathSum(TreeNode root, int sum) {
        if (null == root) {
            return 0;
        }
        int count = 0;
        count += pathSum(root.left, sum);
        count += pathSum(root.right, sum);
        count += rootSum(root, sum);
        return count;
    }

    private int rootSum(TreeNode root, int sum) {
        if (null == root) {
            return 0;
        }
        int count = 0;
        if (root.val == sum) {
            count++;
        }
        count += rootSum(root.left, sum - root.val) + rootSum(root.right, sum - root.val);
        return count;
    }
}
