package org.cchao.leetcode.offer;

import java.util.Arrays;

/**
 * @author cchen6
 * @Date on 2020/5/5
 * @Description 数组中数字出现的次数
 */
public class Offer56_1 {

    public static void main(String[] args) {
        Offer56_1 offer56_1 = new Offer56_1();
        System.out.print("结果：" + Arrays.toString(offer56_1.singleNumbers(new int[] {4, 6, 6, 1})));
    }

    public int[] singleNumbers(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i];
        }

        return nums;
    }
}
