package org.cchao.leetcode.hot100;

/**
 * @author cchen6
 * @Date on 2019/12/31
 * @Description
 */
public class LeetCode18_70 {
    public int climbStairs(int n) {
        int[] array = new int[n + 1];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i <= n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n];
    }
}
