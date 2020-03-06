package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/3/6
 * @Description 和为s的两个数字
 */
public class Offer19_57 {
    public int[] twoSum(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            if (nums[start] + nums[end] == target) {
                return new int[] {nums[start], nums[end]};
            } else  if (nums[start] + nums[end] < target){
                start++;
            } else {
                end--;
            }
        }
        return new int[2];
    }
}
