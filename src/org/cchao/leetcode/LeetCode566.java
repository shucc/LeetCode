package org.cchao.leetcode;

/**
 * Created by shucc on 18/4/11.
 * cc@cchao.org
 */
public class LeetCode566 {

    public static void main(String args[]) {
        int[][] temp1 = new int[][]{{1, 2}, {3, 4}};
    }

    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums.length * nums[0].length != r * c) {
            return nums;
        }
        int transverse = nums[0].length;
        int k = 0;
        int l = 0;
        int[][] result = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = nums[k][l];
                l++;
                if (l >= transverse) {
                    l = 0;
                    k++;
                }
            }
        }
        return result;
    }
}
