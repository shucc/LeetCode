package org.cchao.leetcode;

/**
 * Created by shucc on 18/1/18.
 * cc@cchao.org
 */
public class LeetCode48 {
    
    public static void main(String args[]) {
        int[][] temp1 = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] temp2 = new int[][] {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        printArray(temp1);
        printArray(temp2);
        rotate(temp1);
        rotate(temp2);
        System.out.println("====================================================");
        printArray(temp1);
        printArray(temp2);
    }

    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = matrix[n - j - 1][i];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = result[i][j];
            }
        }
    }

    private static void printArray(int[][] data) {
        StringBuilder result = new StringBuilder("");
        result.append("[");
        for (int i = 0; i < data.length; i++) {
            result.append("[");
            for (int j = 0; j < data[i].length; j++) {
                result.append(String.valueOf(data[i][j]));
                if (j < data[i].length - 1) {
                    result.append(",");
                }
            }
            result.append("]");
            if (i < data.length - 1) {
                result.append(",");
            }
        }
        result.append("]");
        System.out.println(result.toString());
    }
}
