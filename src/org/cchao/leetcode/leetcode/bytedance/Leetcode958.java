package org.cchao.leetcode.leetcode.bytedance;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cchen6
 * @Date on 2021/05/10
 * @Description 二叉树的完全性检验
 */
public class Leetcode958 {

    public boolean isCompleteTree(TreeNode root) {
        if (null == root) {
            return true;
        }
        List<TreeNode> nodeList = new ArrayList<>();
        nodeList.add(root);
        List<TreeNode> tempList = new ArrayList<>();
        List<Integer> nodeValList = new ArrayList<>();
        nodeValList.add(root.val);
        int count = 0;
        while (!nodeList.isEmpty()) {
            tempList.clear();
            boolean needAdd = false;
            for (int i = 0; i < nodeList.size(); i++) {
                nodeValList.add(null == nodeList.get(i) ? null : root.val);
                count++;
                if (null != nodeValList.get(count) && nodeValList.get(count - 1) == null) {
                    return false;
                }
                if (null == nodeList.get(i)) {
                    tempList.add(null);
                    tempList.add(null);
                    continue;
                }
                needAdd = true;
                tempList.add(nodeList.get(i).left);
                tempList.add(nodeList.get(i).right);
            }
            nodeList.clear();
            if (needAdd) {
                nodeList.addAll(tempList);
            }
        }
        return true;
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
