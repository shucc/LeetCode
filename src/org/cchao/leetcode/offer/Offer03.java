package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/3/5
 * @Description 数组中重复的数字
 */
public class Offer03 {
    public int findRepeatNumber(int[] nums) {
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (temp[nums[i]] > 0) {
                return nums[i];
            }
            temp[nums[i]] = 1;
        }
        return 0;
    }
}
