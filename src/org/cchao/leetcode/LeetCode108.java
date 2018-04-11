package org.cchao.leetcode;

/**
 * Created by shucc on 18/4/11.
 * cc@cchao.org
 */
public class LeetCode108 {

    public static void main(String args[]) {

    }
    
    public TreeNode sortedArrayToBST(int[] nums) {
        if (0 == nums.length) {
            return null;
        }
        return recurse(nums, 0);
    }

    public TreeNode recurse(int[] nums, int index) {
        if (index >= nums.length) {
            return null;
        }
        TreeNode resultNode = new TreeNode(nums[index]);
        resultNode.left = recurse(nums, index * 2 + 1);
        resultNode.right = recurse(nums, index * 2 + 2);
        return resultNode;
    }
    
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
