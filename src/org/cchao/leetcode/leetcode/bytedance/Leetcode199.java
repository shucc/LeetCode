package org.cchao.leetcode.leetcode.bytedance;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cchen6
 * @Date on 2021/05/12
 * @Description 二叉树的右视图
 */
public class Leetcode199 {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (null == root) {
            return res;
        }
        List<TreeNode> nodeList = new ArrayList<>();
        List<TreeNode> tempList;
        nodeList.add(root);
        while (!nodeList.isEmpty()) {
            tempList = new ArrayList<>();
            for (int i = 0; i < nodeList.size(); i++) {
                if (null != nodeList.get(i).left) {
                    tempList.add(nodeList.get(i).left);
                }
                if (null != nodeList.get(i).right) {
                    tempList.add(nodeList.get(i).right);
                }
                if (i == nodeList.size() - 1) {
                    res.add(nodeList.get(i).val);
                }
            }
            nodeList = tempList;
        }
        return res;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
