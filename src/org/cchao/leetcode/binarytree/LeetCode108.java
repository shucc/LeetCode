package org.cchao.leetcode.binarytree;

/**
 * Created by shucc on 18/6/4.
 * cc@cchao.org
 * 将有序数组构建为高度平衡的二叉树
 */
public class LeetCode108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (0 == nums.length) {
            return null;
        }
        return buildTree(nums, 0, nums.length);
    }

    private TreeNode buildTree(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int middle = start + end >> 1;
        if (middle < 0 || middle >= nums.length) {
            return null;
        }
        TreeNode rootNode = new TreeNode(nums[middle]);
        rootNode.left = buildTree(nums, start, middle - 1);
        rootNode.right = buildTree(nums, middle + 1, end);
        return rootNode;
    }
}
