package org.cchao.leetcode.bytedance;

import java.util.Stack;

/**
 * @author cchen6
 * @Date on 2020/7/9
 * @Description 简化路径
 */
public class Str06 {

    public static void main(String[] args) {
        System.out.println(new Str06().simplifyPath("/home/"));
        System.out.println(new Str06().simplifyPath("/../"));
        System.out.println(new Str06().simplifyPath("/home//foo/"));
        System.out.println(new Str06().simplifyPath("/a/./b/../../c/"));
        System.out.println(new Str06().simplifyPath("/a/../../b/../c//.//"));
        System.out.println(new Str06().simplifyPath("/a//b////c/d//././/.."));
    }

    public String simplifyPath3(String path) {
        if (null == path) {
            return null;
        }
        //防止/.这种情况
        path = path + "/";
        Stack<Character> stack = new Stack<>();
        char[] pathArray = path.toCharArray();
        for (int i = 0; i < pathArray.length; i++) {
            char now = pathArray[i];
            if (stack.isEmpty()) {
                stack.push(now);
                continue;
            }
            //上一个字符
            char before = stack.peek();
            //不需要重复的//
            if (before == now && before == '/') {
                continue;
            }
            //返回上一级,则一直往前移除直到/
            if (before == now && before == '.') {
                stack.pop();
                stack.pop();
                while (!stack.isEmpty() && stack.peek() != '/') {
                    stack.pop();
                }
                continue;
            }
            //表示当前文件位置，移除.
            if (before == '.' && now == '/') {
                stack.pop();
                continue;
            }
            stack.push(now);
        }
        //移除尾部的/
        if (!stack.isEmpty() && stack.size() > 1 && stack.peek() == '/') {
            stack.pop();
        }
        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }
        return res.reverse().toString();
    }

    public String simplifyPath(String path) {
        String[] s = path.split("/");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length; i++) {
            if (!stack.isEmpty() && s[i].equals(".."))
                stack.pop();
            else if (!s[i].equals("") && !s[i].equals(".") && !s[i].equals(".."))
                stack.push(s[i]);
        }
        if (stack.isEmpty())
            return "/";
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < stack.size(); i++) {
            res.append("/" + stack.get(i));
        }
        return res.toString();
    }
}
