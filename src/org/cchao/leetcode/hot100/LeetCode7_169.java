package org.cchao.leetcode.hot100;

public class LeetCode7_169 {

    /**
     * 摩尔投票法，把不相同的两数抵消
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        int count = 1;
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (temp == nums[i]) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    temp = nums[i + 1];
                }
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(2 ^ 3 ^ 2 ^ 7 ^ 3);
    }
}
