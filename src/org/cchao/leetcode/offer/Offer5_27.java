package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/3/2
 * @Description
 */
public class Offer5_27 {
    public TreeNode mirrorTree(TreeNode root) {
        if (null == root) {
            return null;
        }
        TreeNode left = mirrorTree(root.left);
        TreeNode right = mirrorTree(root.right);
        TreeNode leftTemp = left;
        root.left = root.right;
        root.right = leftTemp;
        return root;
    }
}
