package org.cchao.leetcode.leetcode.bytedance;

import java.util.Stack;

/**
 * @author cchen6
 * @Date on 2021/08/02
 * @Description 最长有效括号
 */
public class Leetcode32 {

    public int longestValidParentheses(String s) {
        if (null == s || s.isEmpty() || s.length() == 1) {
            return 0;
        }
        int max = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    max = Math.max(max, i - stack.peek());
                }
            }
        }
        return max;
    }
}
