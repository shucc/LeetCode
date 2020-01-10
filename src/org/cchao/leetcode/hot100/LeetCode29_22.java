package org.cchao.leetcode.hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cchen6
 * @Date on 2020/1/8
 * @Description
 */
public class LeetCode29_22 {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    private void backtrack(List<String> res, String temp, int open, int close, int n) {
        if (temp.length() == n * 2) {
            res.add(temp);
            return;
        }
        if (open < n) {
            backtrack(res, temp + "(", open + 1, close, n);
        }
        if (close < open) {
            backtrack(res, temp + ")", open, close + 1, n);
        }
    }

    public static void main(String[] args) {
        LeetCode29_22 leetCode29_22 = new LeetCode29_22();
        System.out.println(leetCode29_22.generateParenthesis(3).toString());
    }
}
