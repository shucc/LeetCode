package org.cchao.leetcode.bytedance;

/**
 * @author cchen6
 * @Date on 2020/7/14
 * @Description  最长连续递增序列
 */
public class Array04 {

    public static void main(String[] args) {
        int[] temp = new int[]{1,3,5,4,7};
        System.out.println(new Array04().findLengthOfLCIS(temp));
    }

    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }
        int maxLength = 1;
        int pre = nums[0];
        int nowLength = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > pre) {
                nowLength++;
                pre = nums[i];
            } else {
                pre = nums[i];
                maxLength = Math.max(nowLength, maxLength);
                nowLength = 1;
            }
        }
        return Math.max(nowLength, maxLength);
    }
}
