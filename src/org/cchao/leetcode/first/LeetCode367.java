package org.cchao.leetcode.first;

/**
 * Created by shucc on 18/4/13.
 * cc@cchao.org
 */
public class LeetCode367 {

    public static void main(String args[]) {
        System.out.println(isPerfectSquare2(14));
    }

    public static boolean isPerfectSquare(int num) {
        if (1 == num) {
            return true;
        }
        for (int i = 1; i <= num / 2; i++) {
            if (num == i * i) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPerfectSquare2(int num) {
        //所有完全平方数可表示为1+3+5+7...
        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num == 0;
    }
}
