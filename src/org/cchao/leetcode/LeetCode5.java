package org.cchao.leetcode;

/**
 * Created by shucc on 18/1/12.
 * cc@cchao.org
 */
public class LeetCode5 {

    public static void main(String[] args) {
        System.out.println(longestPalindrome2("babad"));
        System.out.println(longestPalindrome2("cbbd"));
    }

    public static String longestPalindrome(String origin) {
        if (origin.length() == 1) {
            return origin;
        }
        int length = origin.length();
        //反转后的字符串
        StringBuilder reversalBuilder = new StringBuilder("");
        for (int i = origin.length() - 1; i >= 0; i--) {
            reversalBuilder.append(origin.charAt(i));
        }
        if (origin.equals(reversalBuilder.toString())) {
            return origin;
        }
        for (int i = length; i > 0; i--) {
            for (int j = 0; j <= length - i; j++) {
                if (origin.substring(j, j + i).equals(reversalBuilder.substring(length - i - j, length - j))) {
                    return origin.substring(j, j + i);
                }
            }
        }
        return "";
    }

    public static String longestPalindrome2(String origin) {
        if (origin.length() == 1) {
            return origin;
        }
        //将所有字符串修改为奇数数目长的字符串，形如#a#b#c#
        StringBuilder temp = new StringBuilder("#");
        char[] originArray = origin.toCharArray();
        for (int i = 0; i < originArray.length; i++) {
            temp.append(originArray[i]);
            temp.append("#");
        }
        origin = temp.toString();
        originArray = origin.toCharArray();
        int startIndex = 0;
        int endIndex = 1;
        for (int i = 1; i < originArray.length - 1; i++) {
            int[] result = centerDetection(originArray, i);
            if (result[1] - result[0] > endIndex - startIndex) {
                startIndex = result[0];
                endIndex = result[1];
            }
        }
        StringBuilder resultBuilder = new StringBuilder();
        int j = 1;
        for (int i = startIndex; i <= endIndex; i++) {
            if (j % 2 == 0) {
                resultBuilder.append(originArray[i]);
            }
            j++;
        }
        return resultBuilder.toString();
    }

    /**
     * 以index为中心左右扩散检测最长回文子串
     * @param originArray
     * @param index
     * @return
     */
    public static int[] centerDetection(char[] originArray, int index) {
        int[] result = new int[2];
        int leftLength = index;
        int rightLength = originArray.length - index - 1;
        int startIndex = 0;
        int endIndex = index + index;
        if (rightLength < leftLength) {
            startIndex = index - rightLength;
            endIndex = originArray.length - 1;
        }
        result[0] = startIndex;
        result[1] = endIndex;
        while (startIndex < endIndex) {
            if (originArray[startIndex] != originArray[endIndex]) {
                result[0] = startIndex + 1;
                result[1] = endIndex - 1;
            }
            startIndex++;
            endIndex--;
        }
        return result;
    }
}
