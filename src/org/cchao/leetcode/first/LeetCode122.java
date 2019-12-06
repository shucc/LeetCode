package org.cchao.leetcode.first;

/**
 * Created by shucc on 18/5/28.
 * cc@cchao.org
 */
public class LeetCode122 {

    public static void main(String args[]) {

    }

    public static int maxProfit(int[] prices) {
        int length = prices.length;
        if (length == 0 || length == 1) {
            return 0;
        }
        int maxProfit = 0;
        for (int i = 1; i < length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }
}
