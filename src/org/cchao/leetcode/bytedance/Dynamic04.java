package org.cchao.leetcode.bytedance;

/**
 * @author cchen6
 * @Date on 2020/7/21
 * @Description 最大子序和
 */
public class Dynamic04 {

    public static void main(String[] args) {
        int[] temp = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(new Dynamic04().maxSubArray(temp));
    }

    /**
     * 设Ai代表nums[i]，f(i)表示以Ai结尾的最大子序和
     *
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        if (null == nums || nums.length == 0) {
            return 0;
        }
        int maxNum = nums[0];
        int pre = nums[0];
        for (int i = 1; i < nums.length; i++) {
            pre = Math.max(pre + nums[i], nums[i]);
            maxNum = Math.max(maxNum, pre);
        }
        return maxNum;
    }
}
