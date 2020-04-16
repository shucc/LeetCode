package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/4/16
 * @Description 剪绳子
 */
public class Offer14_1 {

    public static void main(String[] args) {
        System.out.println("结果：" + cuttingRope(10));
    }

    /**
     * dp[i]标示长度为i的绳子剪短后多段最大乘积，从k剪，dp[i] = Math.max(k * dp[i - k], k * (i - k))
     *
     * @param n
     * @return
     */
    public static int cuttingRope(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            for (int k = 2; k <= i - 1;  k++) {
                dp[i] = Math.max(dp[i], Math.max(k * dp[i - k], k * (i - k)));
            }
        }
        return dp[n];
    }
}
