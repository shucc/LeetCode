package org.cchao.leetcode.hot100;

public class LeetCode13_121 {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] - prices[i] > profit) {
                    profit = prices[j] - prices[i];
                }
            }
        }
        return profit;
    }

    public static int maxProfit2(int[] prices) {
        int profit = 0;
        int pre = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < pre) {
                pre = prices[i];
            } else if (prices[i] - pre > profit) {
                profit = prices[i] - pre;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] temp = new int[] {7,6,1,4,3,2,4};
        System.out.println("获利：" + maxProfit2(temp));
    }
}
