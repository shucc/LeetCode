package org.cchao.leetcode.bytedance;

/**
 * @author cchen6
 * @Date on 2020/7/20
 * @Description 买卖股票的时间II
 */
public class Dynamic02 {

    /**
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }
}
