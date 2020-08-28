package org.cchao.leetcode.offer;

import java.util.Arrays;

/**
 * @author cchen6
 * @Date on 2020/3/6
 * @Description 和为s的两个数字
 */
public class Offer57_1 {

    public static void main(String[] args) {
        Offer57_1 offer57_1 = new Offer57_1();
        System.out.println(Arrays.toString(offer57_1.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    public int[] twoSum(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int temp = nums[start] + nums[end];
            if (temp == target) {
                return new int[]{nums[start], nums[end]};
            }
            if (temp < target) {
                start++;
            } else {
                end--;
            }
        }
        return new int[2];
    }
}
