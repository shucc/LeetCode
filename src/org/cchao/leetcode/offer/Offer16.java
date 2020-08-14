package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/8/14
 * @Description 数值的整数次方
 */
public class Offer16 {

    public static void main(String[] args) {
        Offer16 offer16 = new Offer16();
        System.out.println(offer16.myPow(2.00, 10) + "-->" + offer16.myPow(2.00, -2));
    }

    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 1 / x * myPow(1 / x, -n - 1);
        }
        return n % 2 == 0 ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
    }
}
