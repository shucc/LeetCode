package org.cchao.leetcode.first;

/**
 * Created by shucc on 18/4/11.
 * cc@cchao.org
 */
public class LeetCode463 {

    public static void main(String args[]) {
        int[][] temp = new int[][]{
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };
        System.out.println(String.valueOf(islandPerimeter(temp)));
    }

    public static int islandPerimeter(int[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        int vertical = grid[0].length;
        int rows = grid.length;
        int count = 0;
        int total = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (1 != grid[i][j]) {
                    continue;
                }
                total++;
                //按照上下左右判断当前方块四个方向是否有连接的岛屿
                if (i > 0 && grid[i - 1][j] == 1) {
                    count++;
                }
                if (i < rows - 1 && grid[i + 1][j] == 1) {
                    count++;
                }
                if (j > 0 && grid[i][j - 1] == 1) {
                    count++;
                }
                if (j < vertical - 1 && grid[i][j + 1] == 1) {
                    count++;
                }
            }
        }
        //总周长减去重叠的边界
        return total * 4 - count;
    }
}
