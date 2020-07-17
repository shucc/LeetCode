package org.cchao.leetcode.bytedance;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cchen6
 * @Date on 2020/7/17
 * @Description 二叉树的锯齿形层次遍历
 */
public class ListNode09 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (null == root) {
            return new ArrayList<>();
        }
        //是否从左往右
        boolean leftToRight = true;
        List<List<Integer>> res = new ArrayList<>();
        List<TreeNode> nodeList = new ArrayList<>();
        nodeList.add(root);
        while (!nodeList.isEmpty()) {
            List<Integer> tempIntList = new ArrayList<>();
            List<TreeNode> tempNodeList = new ArrayList<>();
            if (leftToRight) {
                for (int i = 0; i < nodeList.size(); i++) {
                    TreeNode node = nodeList.get(i);
                    tempIntList.add(node.val);
                    if (null != node.left) {
                        tempNodeList.add(node.left);
                    }
                    if (null != node.right) {
                        tempNodeList.add(node.right);
                    }
                }
            } else {
                for (int i = nodeList.size() - 1; i >= 0; i--) {
                    TreeNode node = nodeList.get(i);
                    tempIntList.add(node.val);
                    if (null != node.right) {
                        tempNodeList.add(0, node.right);
                    }
                    if (null != node.left) {
                        tempNodeList.add(0, node.left);
                    }
                }
            }
            res.add(tempIntList);
            nodeList = tempNodeList;
            leftToRight = !leftToRight;
        }
        return res;
    }
}
