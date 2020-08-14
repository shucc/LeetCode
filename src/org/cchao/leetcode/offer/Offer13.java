package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/8/14
 * @Description 机器人的运动范围
 */
public class Offer13 {

    public static void main(String[] args) {
        Offer13 offer13 = new Offer13();
        System.out.println(offer13.movingCount(2, 3, 1) + "-->");
    }

    public int movingCount(int m, int n, int k) {
        int[][] array = new int[m][n];
        return dfs(array, 0, 0, k);
    }

    private int dfs(int[][] array, int x, int y, int k) {
        if (x >= array.length || y >= array[0].length || array[x][y] > 0 || !canMove(x, y, k)) {
            return 0;
        }
        array[x][y] = 1;
        return 1 + dfs(array, x + 1, y, k) + dfs(array, x, y + 1, k);
    }

    private boolean canMove(int x, int y, int k) {
        int sum = 0;
        while (x >= 10) {
            sum += (x % 10);
            x = x/10;
        }
        sum += x;
        if (sum > k) {
            return false;
        }
        while (y >= 10) {
            sum += (y % 10);
            y = y/10;
        }
        sum += y;
        return sum <= k;
    }
}
