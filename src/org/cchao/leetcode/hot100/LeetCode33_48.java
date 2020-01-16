package org.cchao.leetcode.hot100;

/**
 * @author cchen6
 * @Date on 2020/1/13
 * @Description
 */
public class LeetCode33_48 {
    public int[][] rotate(int[][] matrix) {
        int size = matrix.length;
        int[][] res = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                res[j][size - i - 1] = matrix[i][j];
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = res[i][j];
            }
        }
        return res;
    }

    private void print(int[][] matrix) {
        StringBuilder stringBuilder;
        int size = matrix.length;
        for (int i = 0; i < size; i++) {
            stringBuilder = new StringBuilder();
            for (int j = 0; j < size; j++) {
                stringBuilder.append(matrix[i][j] + ",");
            }
            System.out.println(stringBuilder.toString());
        }
    }

    public static void main(String[] args) {
        LeetCode33_48 leetCode33_48 = new LeetCode33_48();
        int[][] temp = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        leetCode33_48.print(temp);
        leetCode33_48.print(leetCode33_48.rotate(temp));
    }
}
