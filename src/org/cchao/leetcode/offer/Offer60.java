package org.cchao.leetcode.offer;

import java.util.Arrays;

/**
 * @author cchen6
 * @Date on 2020/8/28
 * @Description n个骰子的点数
 */
public class Offer60 {

    public static void main(String[] args) {
        Offer60 offer60 = new Offer60();
        System.out.println(Arrays.toString(offer60.twoSum(3)));
    }

    /**
     * dp[i][j]表示i个骰子投掷后出现点数j的次数
     *
     * @param n
     * @return
     */
    public double[] twoSum(int n) {
        //dp[骰子个数][所有可能的值]
        int[][] dp = new int[n + 1][6 * n + 1];
        for (int i = 1; i <= 6; i++) {
            dp[1][i] = 1;
        }
        //i代表当前骰子的个数
        for (int i = 2; i <= n; i++) {
            //j代表当前值的和
            for (int j = i; j <= 6 * n; j++) {
                //k代表当前筛子的值
                for (int k = 1; k <= 6 && k <= j; k++) {
                    //状态转移方程： i个骰子和为j += i-1个骰子和为j-k + 第i个骰子值为k
                    dp[i][j] += dp[i - 1][j - k];
                }
            }
        }
        final double totalNum = Math.pow(6, n);//总次数
        double[] ans = new double[5 * n + 1];
        for (int i = n; i <= 6 * n; i++) {
            ans[i - n] = ((double) dp[n][i]) / totalNum;
        }
        return ans;
    }
}
