package org.cchao.leetcode.offer;

import java.util.Arrays;

/**
 * @author cchen6
 * @Date on 2020/3/6
 * @Description 调整数组顺序使奇数位于偶数前面
 */
public class Offer21 {
    public int[] exchange(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            while (start < end && (nums[start] % 2) == 1) {
                start++;
            }
            while (start < end && (nums[end] % 2) == 0) {
                end--;
            }
            swap(nums, start, end);
        }
        return nums;
    }

    private void swap(int[] nums, int i, int j) {
        if (i == j) {
            return;
        }
        nums[i] = nums[i] + nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] = nums[i] - nums[j];
    }

    public static void main(String[] args) {
        Offer21 offer19_21 = new Offer21();
        int[] temp = new int[]{2,16,3,5,13,1,16,1,12,18,11,8,11,11,5,1};
        offer19_21.exchange(temp);
        System.out.println(Arrays.toString(temp));
    }
}
