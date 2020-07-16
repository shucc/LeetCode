package org.cchao.leetcode.bytedance;

import java.util.Arrays;

/**
 * @author cchen6
 * @Date on 2020/7/15
 * @Description 最长连续子序列
 */
public class Array06 {

    public static void main(String[] args) {
        int[] temp = new int[] {100, 4, 200, 1, 3, 2};
        System.out.println(new Array06().longestConsecutive(temp));
    }

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }
        Arrays.sort(nums);
        int longest = 1;
        int nowLength = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] - nums[i - 1] == 1) {
                nowLength++;
            } else {
                longest = Math.max(longest, nowLength);
                nowLength = 1;
            }
        }
        return Math.max(longest, nowLength);
    }
}
