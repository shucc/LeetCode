package org.cchao.leetcode.offer;

import java.util.Arrays;

/**
 * @author cchen6
 * @Date on 2020/8/27
 * @Description 滑动窗口的最大值
 */
public class Offer59_1 {

    public static void main(String[] args) {
        int[] temp = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        Offer59_1 offer59_1 = new Offer59_1();
        System.out.println(Arrays.toString(offer59_1.maxSlidingWindow(temp, 3)));
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) {
            return new int[0];
        }
        if (k > nums.length) {
            k = nums.length;
        }
        int len = nums.length;
        int[] maxLeft = new int[len];
        int[] maxRight = new int[len];
        //从左往右窗口的第一个最大值默认是数组第一个值
        maxLeft[0] = nums[0];
        //从右往左窗口的最后一个最大值是数组的最后一个值
        maxRight[len - 1] = nums[len - 1];
        for (int i = 1; i < len; i++) {
            //这里分别计算从前往后窗口的最大值和从后往前窗口的最大值。要搞懂这里的判断，如果i % k == 0，表示到了下一个窗口
            maxLeft[i] = (i % k == 0) ? nums[i] : Math.max(maxLeft[i - 1], nums[i]);
            int j = len - i - 1;
            maxRight[j] = ((j + 1) % k == 0) ? nums[j] : Math.max(maxRight[j + 1], nums[j]);
        }
        //返回的结果值
        int[] res = new int[len - k + 1];
        for (int i = 0; i < res.length; i++) {
            //取每个窗口内从左往右扫描的最后一个值和从右往左扫描的最后一个值(如果从左边数是第一个)的最大值
            res[i] = Math.max(maxRight[i], maxLeft[i + k - 1]);
        }
        return res;
    }
}
