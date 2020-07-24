package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/4/16
 * @Description 股票的最大利润
 */
public class Offer63 {

    public static void main(String[] args) {
        int[] temp = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println("结果：" + maxProfit2(temp));
    }

    /**
     * dp[i]标示以prices[i]结尾的最大收益，dp[i] = Math.max(dp[i-1],prices[i] - Math.min(prices[0,i]))
     *
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int[] dp = new int[prices.length];
        dp[0] = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i] = Math.max(dp[i - 1], prices[i] - min);
            if (prices[i] < min) {
                min = prices[i];
            }
        }
        return dp[prices.length - 1];
    }

    public static int maxProfit2(int[] prices) {
        if (null == prices || prices.length == 0) {
            return 0;
        }
        int maxProfit = 0;
        int pre = prices[0];
        for (int i =1; i < prices.length; i++) {
            if (prices[i] <= pre) {
                pre = prices[i];
            } else {
                maxProfit = Math.max(prices[i] - pre, maxProfit);
            }
        }
        return maxProfit;
    }

}
