package org.cchao.leetcode.hot100;

import java.util.Arrays;

public class LeetCode9_283 {
    public static void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[index] != 0) {
                index++;
                continue;
            }
            if (nums[index] == 0 && nums[i] != 0) {
                nums[index] = nums[i];
                nums[i] = 0;
                index++;
            }
        }
    }

    public static void main(String[] args) {
        int[] temp = new int[]{1,0,1};
        System.out.println(Arrays.toString(temp));
        moveZeroes(temp);
        System.out.println(Arrays.toString(temp));
    }
}
