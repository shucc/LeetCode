package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/4/16
 * @Description 连续子数组的最大和
 */
public class Offer42 {

    public static void main(String[] args) {
        int[] temp = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("结果:" + maxSubArray2(temp));
    }

    public static int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (dp[i - 1] <= 0) {
                dp[i] = nums[i];
            } else {
                dp[i] = dp[i - 1] + nums[i];
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < dp.length; i++) {
            if (dp[i] > max) {
                max = dp[i];
            }
        }
        return max;
    }

    /**
     * dp[i]表示以nums[i]结尾的最大连续子序和，则dp[i]=Math.max(nums[i],dp[i-1]+nums[i])
     * @param nums
     * @return
     */
    public static int maxSubArray2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int maxProfit = nums[0];
        int pre = nums[0];
        for (int i = 1; i < nums.length; i++) {
            pre = Math.max(nums[i], pre + nums[i]);
            maxProfit = Math.max(maxProfit, pre);
        }
        return maxProfit;
    }
}
