package org.cchao.leetcode.hot100;

/**
 * @author cchen6
 * @Date on 2020/1/16
 * @Description
 */
public class LeetCode36_64 {
    public int minPathSum(int[][] grid) {
        int[][] res = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i > 0 && j > 0) {
                    res[i][j] = grid[i][j] + Math.min(res[i - 1][j], res[i][j - 1]);
                } else if (i > 0 && j == 0) {
                    res[i][j] = grid[i][j] + res[i - 1][j];
                } else if (i == 0 && j > 0) {
                    res[i][j] = grid[i][j] + res[i][j - 1];
                } else if (i == 0 && j == 0) {
                    res[i][j] = grid[i][j];
                }
            }
        }
        return res[grid.length - 1][grid[0].length - 1];
    }
}
