package org.cchao.leetcode.resume;

public class Resume3 {

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }
        return searchChild(matrix, 0, matrix[0].length - 1, target);
    }

    public static boolean searchChild(int[][] matrix, int x, int y, int target) {
        if (x >= matrix.length) {
            return false;
        }
        if (y < 0) {
            return false;
        }
        if (matrix[x][y] == target) {
            return true;
        }
        if (matrix[x][y] > target) {
            return searchChild(matrix, x, y - 1, target);
        }
        return searchChild(matrix, x + 1, y, target);
    }

    public static void main(String[] args) {
        int[][] temp = new int[][] {
                {1,   4,  7, 11, 15},
                  {2,   5,  8, 12, 19},
                  {3,   6,  9, 16, 22},
                  {10, 13, 14, 17, 24},
                  {18, 21, 23, 26, 30}
        };
        System.out.println(searchMatrix(temp, 5) + "-->" + searchMatrix(temp, 20));
    }
}
