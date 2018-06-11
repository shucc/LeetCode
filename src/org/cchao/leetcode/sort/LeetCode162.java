package org.cchao.leetcode.sort;

/**
 * Created by shucc on 18/6/11.
 * cc@cchao.org
 * 寻找峰值
 */
public class LeetCode162 {

    public static void main(String args[]) {
        int[] test = new int[]{1, 2, 2, 1, 5, 6, 4};
        System.out.println(String.valueOf(findPeakElement(test)));
    }

    public static int findPeakElement(int[] nums) {
        int length = nums.length;
        if (length == 1) {
            return 0;
        }
        int left = -1;
        int middle = 0;
        int right = 1;
        for (int i = 0; i < length; i++) {
            if ((left == -1 || nums[middle] > nums[left]) && (right == length || nums[middle] > nums[right])) {
                return middle;
            }
            left++;
            middle++;
            right++;
        }
        return -1;
    }
}
