package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/4/16
 * @Description 礼物的最大价值
 */
public class Offer47 {

    public static void main(String[] args) {
        int[][] temp = new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        System.out.println("结果：" + maxValue2(temp));
    }

    public static int maxValue(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = grid[i][j];
                } else if (i == 0) {
                    dp[i][j] = dp[i][j - 1] + grid[i][j];
                } else if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + grid[i][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
                }
            }
        }
        return dp[grid.length - 1][grid[0].length - 1];
    }

    /**
     * Ai表示(i,j)礼物数，dp[i][j]表示(i,j)作为右下脚可获得的最大礼物数，dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1])+Ai
     *
     * @param grid
     * @return
     */
    public static int maxValue2(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int[][] dp = new int[grid.length][grid[0].length];
        int maxValue = grid[0][0];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 && j == 0) {
                    dp[0][0] = grid[0][0];
                } else if (i == 0) {
                    dp[i][j] = dp[i][j - 1] + grid[i][j];
                } else if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + grid[i][j];
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]) + grid[i][j];
                }
                if (dp[i][j] > maxValue) {
                    maxValue = dp[i][j];
                }
            }
        }
        return maxValue;
    }
}
