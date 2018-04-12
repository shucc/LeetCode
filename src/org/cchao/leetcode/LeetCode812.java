package org.cchao.leetcode;

/**
 * Created by shucc on 18/4/12.
 * cc@cchao.org
 */
public class LeetCode812 {

    public static void main(String args[]) {
        int[][] test = new int[][]{{1, 0}, {0, 0}, {0, 1}};
        System.out.println(String.valueOf(largestTriangleArea(test)));
    }

    public static double largestTriangleArea(int[][] points) {
        int length = points.length;
        double area = 0;
        for (int i = 0; i < length - 2; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                for (int k = j + 1; k < length; k++) {
                    area = Math.max(area, area(points[i], points[j], points[k]));
                }
            }
        }
        return area;
    }

    private static double area(int[] x, int[] y, int[] z) {
        return 0.5 * Math.abs(x[0] * y[1] + y[0] * z[1] + z[0] * x[1]
                - x[1] * y[0] - y[1] * z[0] - z[1] * x[0]);
    }
}
