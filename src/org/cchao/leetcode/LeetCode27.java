package org.cchao.leetcode;

/**
 * Created by shucc on 18/4/12.
 * cc@cchao.org
 */
public class LeetCode27 {

    public static void main(String args[]) {

    }

    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
