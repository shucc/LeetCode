package org.cchao.leetcode.hot100;

/**
 * @author cchen6
 * @Date on 2020/1/15
 * @Description
 */
public class LeetCode35_96 {
    public int numTrees(int n) {
        int[] G = new int[n + 1];
        G[0] = 1;
        G[1] = 1;
        for (int i = 2; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                G[i] += G[j - 1] * G[i - j];
            }
        }
        return G[n];
    }
}
