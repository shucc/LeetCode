package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/3/6
 * @Description 数组中出现次数超过一半的数字
 */
public class Offer39 {
    public int majorityElement(int[] nums) {
        int count = 0;
        int cur = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == cur) {
                count++;
            } else if (count == 1){
                cur = nums[i];
            } else {
                count--;
            }
        }
        return cur;
    }
}
