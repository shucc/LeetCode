package org.cchao.leetcode;

/**
 * Created by shucc on 18/4/16.
 * cc@cchao.org
 */
public class LeetCode41_java {

    public static void main(String args[]) {
        System.out.println(String.valueOf(2 << 3));
        System.out.println(String.valueOf(firstMissingPositive(new int[]{1, 2, 0})));
    }

    public static int firstMissingPositive(final int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int num = nums[i];
            if (i != num - 1 && num >= 1 && num <= nums.length && num != nums[num - 1]) {
                swap(nums, i, num - 1);
            } else {
                i++;
            }
        }

        for (i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (i != num - 1) {
                return i + 1;
            }
        }

        return nums.length + 1;
    }

    private static void swap(final int[] nums, final int i, final int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

