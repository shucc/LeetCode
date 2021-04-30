package org.cchao.leetcode.leetcode.bytedance;

/**
 * @author cchen6
 * @Date on 2021/04/30
 * @Description 最大子序和
 */
public class Leetcode53 {

    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int nowSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nowSum = Math.max(nums[i], nums[i] + nowSum);
            max = Math.max(max, nowSum);
        }
        return max;
    }
}
