package org.cchao.leetcode;

/**
 * Created by shucc on 18/5/23.
 * cc@cchao.org
 * 最大子序和
 */
public class LeetCode53 {

    public static void main(String args[]) {
        int[] test = new int[]{-3, -2, 0, -1};
        System.out.println(String.valueOf(maxSubArray(test)));
    }

    private static int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}
