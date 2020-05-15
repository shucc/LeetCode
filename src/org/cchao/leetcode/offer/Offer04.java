package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/5/6
 * @Description 二维数组中的查找
 */
public class Offer04 {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }
        if (matrix[0].length == 0) {
            return false;
        }
        int maxX = matrix.length - 1;
        int maxY = matrix[0].length - 1;
        int x = 0;
        int y = maxY;
        while (x <= maxX && y >= 0) {
            if (target == matrix[x][y]) {
                return true;
            }
            if (target < matrix[x][y]) {
                y--;
            } else {
                x++;
            }
        }
        return false;
    }
}
