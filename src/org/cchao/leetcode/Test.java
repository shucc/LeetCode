package org.cchao.leetcode;

import java.util.Arrays;

/**
 * @author cchen6
 * @Date on 2020/7/21
 * @Description
 */
public class Test {

    /**
     * dp[i]表示凑到i的最少硬币数，则dp[i]=min(dp[i-coins[0]+1,dp[i-coins[1]+1,...)
     * @param coins
     * @param amount
     * @return
     */
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] < i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] +1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
