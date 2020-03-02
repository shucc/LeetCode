package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/2/27
 * @Description 左旋转字符串
 */
public class Offer1_58 {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }
}
