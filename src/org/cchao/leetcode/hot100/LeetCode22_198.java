package org.cchao.leetcode.hot100;

import java.util.Map;

/**
 * @author cchen6
 * @Date on 2020/1/2
 * @Description
 */
public class LeetCode22_198 {
    public int rob(int[] nums) {
        if (null == nums || nums.length == 0) {
            return 0;
        }
        //当n为1,2时特殊处理
        if (nums.length == 1) {
            return nums[0];
        }
        int max = Math.max(nums[0], nums[1]);
        if (nums.length == 2) {
            return max;
        }
        int pre = nums[0];
        for (int i = 2; i < nums.length; i++) {
           int temp = max;
           //按照公式计算f(n)=Math.max(f(n-2)+A(n),f(n-1))
           max = Math.max(pre + nums[i], max);
           pre = temp;
        }
        return max;
    }
}
