package org.cchao.leetcode;

import java.util.Stack;

/**
 * Created by shucc on 18/1/16.
 * cc@cchao.org
 */
public class LeetCode20 {

    public static void main(String args[]) {
        System.out.println(String.valueOf(isValid("()")));
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if ('(' == c) {
                stack.push(')');
            } else if ('[' == c) {
                stack.push(']');
            } else if ('{' == c) {
                stack.push('}');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
