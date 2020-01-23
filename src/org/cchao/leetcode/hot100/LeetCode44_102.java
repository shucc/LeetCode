package org.cchao.leetcode.hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cchen6
 * @Date on 2020/1/21
 * @Description
 */
public class LeetCode44_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        if (null == root) {
            return res;
        }
        //每层的node
        ArrayList<TreeNode> nodeList = new ArrayList<>();
        nodeList.add(root);
        while (!nodeList.isEmpty()) {
            ArrayList<TreeNode> tempNodeList = new ArrayList<>();
            ArrayList<Integer> tempList = new ArrayList<>();
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
