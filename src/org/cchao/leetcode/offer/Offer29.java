package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/8/20
 * @Description 顺时针打印矩阵
 */
public class Offer29 {

    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        int[] res = new int[matrix.length * matrix[0].length];
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        int index = 0;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                res[index++] = matrix[top][i];
            }
            for (int i = top + 1; i <= bottom; i++) {
                res[index++] = matrix[i][right];
            }
            if (left < right && top < bottom) {
                for (int i = right - 1; i > left; i--) {
                    res[index++] = matrix[bottom][i];
                }
                for (int i = bottom; i > top; i--) {
                    res[index++] = matrix[i][left];
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return res;
    }
}
