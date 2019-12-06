package org.cchao.leetcode.first.sort;

/**
 * Created by shucc on 18/6/8.
 * cc@cchao.org
 */
public class LeetCode75 {

    public static void main(String args[]) {
        int[] test = new int[]{2, 0, 2, 1, 1, 0};
        sortColors(test);
        for (int value : test) {
            System.out.print("-->" + value);
        }
    }

    public static void sortColors(int[] nums) {
        int zeroSize = 0;
        int oneSize = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroSize++;
            } else if (nums[i] == 1) {
                oneSize++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i < zeroSize) {
                nums[i] = 0;
            } else if (i < zeroSize + oneSize) {
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }
        }
    }
}
