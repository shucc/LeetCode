package org.cchao.leetcode.hot100;

public class LeetCode6_136 {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] temp = new int[] {2,2,1};
        System.out.println(singleNumber(temp));
        System.out.println((2 ^ 2) + "-->" + (2 ^ 14) + "-->" + (0 ^ 25));
    }
}
