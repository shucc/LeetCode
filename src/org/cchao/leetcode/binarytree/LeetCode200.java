package org.cchao.leetcode.binarytree;

/**
 * Created by shucc on 18/6/7.
 * cc@cchao.org
 * 岛屿的个数
 */
public class LeetCode200 {

    public static void main(String args[]) {
        char[][] test1 = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        char[][] test2 = new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        char[][] test3 = new char[][]{
                {'1', '1', '1'},
                {'0', '1', '0'},
                {'1', '1', '1'}
        };
        System.out.println(String.valueOf(numIslands(test1)) + "-->" + numIslands(test2) + "-->" + numIslands(test3));
    }

    public static int numIslands(char[][] grid) {
        if (null == grid || grid.length == 0) {
            return 0;
        }
        int count = 0; // 4
        int rows = grid.length; // 5
        int vertical = grid[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < vertical; j++) {
                if (grid[i][j] == '1') {
                    searchGrid(grid, i, j, rows, vertical);
                    count++;
                }
            }
        }
        return count;
    }

    private static void searchGrid(char[][] grid, int rowIndex, int verticalIndex, int maxRow, int maxVertical) {
        if (rowIndex < 0 || rowIndex >= maxRow || verticalIndex < 0 || verticalIndex >= maxVertical || '0' == grid[rowIndex][verticalIndex]) {
            return;
        }
        grid[rowIndex][verticalIndex] = '0';
        searchGrid(grid, rowIndex, verticalIndex - 1, maxRow, maxVertical);
        searchGrid(grid, rowIndex, verticalIndex + 1, maxRow, maxVertical);
        searchGrid(grid, rowIndex - 1, verticalIndex, maxRow, maxVertical);
        searchGrid(grid, rowIndex + 1, verticalIndex, maxRow, maxVertical);
    }
}
