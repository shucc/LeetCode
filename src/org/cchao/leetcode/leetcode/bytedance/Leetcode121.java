package org.cchao.leetcode.leetcode.bytedance;

/**
 * @author cchen6
 * @Date on 2021/05/11
 * @Description 买卖股票最佳时机
 */
public class Leetcode121 {

    public static void main(String[] args) {
        Leetcode121 leetcode121 = new Leetcode121();
        int[] temp = new int[] {7,1,5,3,6,4};
        System.out.println("Result:" + leetcode121.maxProfit(temp));
    }

    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int maxProfit = 0;
        int nowPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > nowPrice) {
                maxProfit = Math.max(maxProfit, prices[i] - nowPrice);
            } else {
                nowPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
