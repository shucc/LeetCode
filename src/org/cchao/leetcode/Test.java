package org.cchao.leetcode;

/**
 * @author cchen6
 * @Date on 2020/4/27
 * @Description
 */
public class Test {

    public static void main(String[] args) {
        for (int i = -10; i <= 10; i++) {
            System.out.println("结果：" + isOdd(i));
        }
    }

    private static boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
