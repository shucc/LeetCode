package org.cchao.leetcode.bytedance;

/**
 * @author cchen6
 * @Date on 2020/7/9
 * @Description 翻转字符串里的单词
 */
public class Str05 {
    public static void main(String[] args) {
        System.out.println(new Str05().reverseWords("the sky is blue"));
        System.out.println(new Str05().reverseWords("  hello world!  "));
        System.out.println(new Str05().reverseWords("a good   example"));
    }

    public String reverseWords(String s) {
        if (null == s) {
            return null;
        }
        String[] splitArray = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = splitArray.length - 1; i >= 0; i--) {
            if (splitArray[i].length() > 0) {
                res.append(splitArray[i]).append(" ");
            }
        }
        return res.toString().trim();
    }
}
