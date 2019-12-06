package org.cchao.leetcode.first.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by shucc on 18/4/20.
 * cc@cchao.org
 * 中序遍历
 */
public class InorderTraversal {

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (null != root) {
            result.addAll(inorderTraversal(root.left));
            result.add(root.val);
            result.addAll(inorderTraversal(root.right));
        }
        return result;
    }

    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> nodeStack = new Stack<>();
        TreeNode nowNode = root;
        while (null != nowNode || !nodeStack.isEmpty()) {
            while (null != nowNode) {
                nodeStack.push(nowNode);
                nowNode = nowNode.left;
            }
            nowNode = nodeStack.pop();
            result.add(nowNode.val);
            nowNode = nowNode.right;
        }
        return result;
    }
}
