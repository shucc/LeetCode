package org.cchao.leetcode.hot100;

public class LeetCode17_53 {

    public static int maxSubArray(int[] nums) {
        int curItem = nums[0], maxItem = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curItem = Math.max(nums[i], nums[i] + curItem);
            maxItem = Math.max(maxItem, curItem);
        }
        return maxItem;
    }

    public static void main(String[] args) {
        int[] temp = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(temp));
    }
}
