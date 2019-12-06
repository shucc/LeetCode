package org.cchao.leetcode.first;

/**
 * Created by shucc on 18/4/12.
 * cc@cchao.org
 */
public class LeetCode303 {

    public static void main(String args[]) {

    }

    class NumArray {

        private int[] nums;

        public NumArray(int[] nums) {
            this.nums = nums;
        }

        public int sumRange(int i, int j) {
            int sum = 0;
            for (int k = i; k <= j; k++) {
                sum += nums[k];
            }
            return sum;
        }
    }
}
