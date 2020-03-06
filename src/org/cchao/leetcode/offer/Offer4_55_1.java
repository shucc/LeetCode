package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/3/2
 * @Description
 */
public class Offer4_55_1 {
    public int maxDepth(TreeNode root) {
        if (null == root) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }
}
