package org.cchao.leetcode.bytedance;

/**
 * @author cchen6
 * @Date on 2020/7/8
 * @Description 字符串相乘
 */
public class Str04 {

    public static void main(String[] args) {
        String temp = "784374837483";
        System.out.println(new Str04().multiply("123", "456"));
    }

    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        String res = "";
        for (int i = num1.length() - 1; i >= 0; i--) {
            StringBuilder temp = new StringBuilder();
            int numTemp = num1.charAt(i) - '0';
            int nextNum = 0;
            for (int j = num2.length() - 1; j >= 0; j--) {
                int result = (numTemp * (num2.charAt(j) - '0')) + nextNum;
                temp.insert(0, result % 10);
                nextNum = result / 10;
            }
            if (nextNum > 0) {
                temp.insert(0, nextNum);
            }
            for (int k = 0; k < num1.length() - 1 - i; k++) {
                temp.append("0");
            }
            res = add(res, temp.toString());
        }
        return res;
    }

    private String add(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int length1 = num1.length();
        int length2 = num2.length();
        int nextNum = 0;
        int index1 = length1 - 1;
        int index2 = length2 - 1;
        while (index1 >= 0 || index2 >= 0) {
            int temp = (index1 < 0 ? 0 : num1.charAt(index1) - '0') + (index2 < 0 ? 0 : num2.charAt(index2) - '0') + nextNum;
            nextNum = temp / 10;
            res.insert(0, temp % 10);
            index1--;
            index2--;
        }
        if (nextNum > 0) {
            res.insert(0, nextNum);
        }
        return res.toString();
    }
}
