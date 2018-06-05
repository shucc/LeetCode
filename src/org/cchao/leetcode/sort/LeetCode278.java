package org.cchao.leetcode.sort;

/**
 * Created by shucc on 18/6/5.
 * cc@cchao.org
 */
public class LeetCode278 {

    /**
     * 折半查找
     * @param n
     * @return
     */
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (isBadVersion(middle)) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }

    private boolean isBadVersion(int version) {
        return version % 2 == 0;
    }
}
