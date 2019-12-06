package org.cchao.leetcode.first;

/**
 * Created by shucc on 18/5/23.
 * cc@cchao.org
 * 打家劫舍
 */
public class LeetCode198 {

    public static void main(String args[]) {
        int[] test1 = new int[]{2, 7, 9, 3, 1};
        int[] test2 = new int[]{2, 1, 1, 2};
        System.out.println(String.valueOf(rob(test1)) + "-->" + rob(test2));
    }

    public static int rob(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        if (length == 1) {
            return nums[1];
        }
        if (length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int sum[] = new int[length];
        sum[0] = nums[0];
        sum[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < length; i++) {
            sum[i] = Math.max(sum[i - 1], sum[i - 2] + nums[i]);
        }
        return sum[length - 1];
    }
}
