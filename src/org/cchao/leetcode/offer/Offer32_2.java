package org.cchao.leetcode.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cchen6
 * @Date on 2020/3/4
 * @Description 从上到下打印二叉树 II
 */
public class Offer32_2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (null == root) {
            return res;
        }
        List<TreeNode> nodeList = new ArrayList<>();
        nodeList.add(root);
        while (!nodeList.isEmpty()) {
            List<TreeNode> tempNodeList = new ArrayList<>();
            List<Integer> tempList = new ArrayList<>();
            for (TreeNode node : nodeList) {
                tempList.add(node.val);
                if (null != node.left) {
                    tempNodeList.add(node.left);
                }
                if (null != node.right) {
                    tempNodeList.add(node.right);
                }
            }
            res.add(tempList);
            nodeList = tempNodeList;
        }
        return res;
    }
}
