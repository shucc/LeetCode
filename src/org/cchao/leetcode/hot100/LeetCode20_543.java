package org.cchao.leetcode.hot100;

/**
 * @author cchen6
 * @Date on 2019/12/31
 * @Description
 */
public class LeetCode20_543 {

    private int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (null == root || (null == root.right && null == root.left)) {
            return 0;
        }
        childDiameter(root);
        return max;
    }

    public int childDiameter(TreeNode root) {
        if (null == root) {
            return 0;
        }
        int L = childDiameter(root.left);
        int R = childDiameter(root.right);
        max = Math.max(max, L + R);
        return Math.max(L, R) + 1;
    }
}
