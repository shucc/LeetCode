package org.cchao.leetcode.binarytree;

import java.util.Arrays;

/**
 * Created by shucc on 18/5/10.
 * cc@cchao.org
 * 最大二叉树
 */
public class LeetCode654 {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }
        int maxIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        TreeNode treeNode = new TreeNode(nums[maxIndex]);
        if (maxIndex > 0) {
            treeNode.left = constructMaximumBinaryTree(Arrays.copyOfRange(nums, 0, maxIndex));
        }
        if (maxIndex < nums.length - 1) {
            treeNode.right = constructMaximumBinaryTree(Arrays.copyOfRange(nums, maxIndex + 1, nums.length));
        }
        return treeNode;
    }
}
