package org.cchao.leetcode.first;

public class LeetCode1 {

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 4};
	    int[] result1 = twoSum(nums, 6);
	    System.out.println(String.valueOf(result1[0]) + "-->" + result1[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
