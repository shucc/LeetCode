package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/8/26
 * @Description 翻转单词顺序
 */
public class Offer58_1 {

    public static void main(String[] args) {
        Offer58_1 offer58_1 = new Offer58_1();
        System.out.println(offer58_1.reverseWords("I am a student. ") + "-->" + offer58_1.reverseWords("a good   example"));
    }

    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i].length() == 0) {
                continue;
            }
            builder.append(words[i]).append(" ");
        }
        return builder.toString().trim();
    }
}
