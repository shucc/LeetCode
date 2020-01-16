package org.cchao.leetcode.hot100;

/**
 * @author cchen6
 * @Date on 2020/1/14
 * @Description
 */
public class LeetCode34_238 {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int k = 1;
        for (int i = 0; i < nums.length; i++) {
            output[i] = k;
            k = k * nums[i];
        }
        k = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] = output[i] * k;
            k = k * nums[i];
        }
        return output;
    }

    public static void main(String[] args) {
        LeetCode34_238 leetCode34_238 = new LeetCode34_238();
        int[] temp = new int[] {1,2,3,4};
        leetCode34_238.productExceptSelf(temp);
    }
}
