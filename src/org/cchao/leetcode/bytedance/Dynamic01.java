package org.cchao.leetcode.bytedance;

/**
 * @author cchen6
 * @Date on 2020/7/20
 * @Description 买卖股票的时间I
 */
public class Dynamic01 {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        if (prices.length == 0) {
            return maxProfit;
        }
        int price = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] >= price) {
                maxProfit = Math.max(maxProfit, prices[i] - price);
            } else {
                price = prices[i];
            }
        }
        return maxProfit;
    }
}
