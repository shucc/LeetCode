package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/5/5
 * @Description  求1+2+…+n
 */
public class Offer64 {
    public int sumNums(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + i;
        }
        return dp[n];
    }
}
