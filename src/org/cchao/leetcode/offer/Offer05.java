package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/3/2
 * @Description 替换空格
 */
public class Offer05 {
    public String replaceSpace(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String temp = "We are happy.";
        for (int i = 0; i < temp.length(); i++) {
            System.out.print(1 + temp.charAt(i));
            System.out.print("-->");
        }
    }
}
