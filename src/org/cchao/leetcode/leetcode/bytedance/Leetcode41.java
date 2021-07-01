package org.cchao.leetcode.leetcode.bytedance;

import java.util.Arrays;

/**
 * @author cchen6
 * @Date on 2021/05/13
 * @Description 缺失的第一个正数
 */
public class Leetcode41 {

    public static void main(String[] args) {
        int[] temp1 = new int[] {7,8,9,11,12};
        int[] temp2 = new int[] {3,4,-1,1};
        int[] temp3 = new int[] {1,2,0};
        Leetcode41 leetcode41 = new Leetcode41();
        System.out.println("Result:" + leetcode41.firstMissingPositive(temp1) + "-->" + leetcode41.firstMissingPositive(temp2) + "-->" + leetcode41.firstMissingPositive(temp3));
    }

    public int firstMissingPositive(int[] nums) {
        if (null == nums || nums.length == 0) {
            return 1;
        }
        Arrays.sort(nums);
        int min = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == min) {
                min++;
            }
        }
        return min;
    }
}
