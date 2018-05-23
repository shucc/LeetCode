package org.cchao.leetcode;

/**
 * Created by shucc on 18/5/23.
 * cc@cchao.org
 * 买卖股票最佳时机
 */
public class LeetCode121 {

    public static void main(String args[]) {
        int[] test1 = new int[]{7, 1, 5, 3, 6, 4};
        int[] test2 = new int[]{7, 6, 5, 4, 3, 2, 1};
        System.out.println(String.valueOf(maxProfit2(test1)) + "-->" + maxProfit2(test2));
    }

    public static int maxProfit(int[] prices) {
        int length = prices.length;
        if (length == 0) {
            return 0;
        }
        int minStart;
        int profit;
        int maxProfit = 0;
        for (int i = 0; i < length - 1; i++) {
            minStart = i;
            profit = 0;
            for (int j = i + 1; j < length; j++) {
                if (prices[j] < prices[minStart]) {
                    break;
                } else if (prices[j] - prices[minStart] > profit) {
                    profit = prices[j] - prices[minStart];
                }
            }
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }

    private static int maxProfit2(int[] prices) {
        if (prices.length == 1 || prices.length == 0) {
            return 0;
        }
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}
