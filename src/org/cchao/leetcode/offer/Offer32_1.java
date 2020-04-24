package org.cchao.leetcode.offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author cchen6
 * @Date on 2020/4/23
 * @Description 从上到下打印二叉树
 */
public class Offer32_1 {

    public int[] levelOrder(TreeNode root) {
        if (null == root) {
            return new int[0];
        }
        List<Integer> resList = new ArrayList<>();
        List<TreeNode> nodeList = new ArrayList<>();
        nodeList.add(root);
        while (!nodeList.isEmpty()) {
            List<TreeNode> temp = new ArrayList<>();
            for (TreeNode node : nodeList) {
                resList.add(node.val);
                if (null != node.left) {
                    temp.add(node.left);
                }
                if (null != node.right) {
                    temp.add(node.right);
                }
            }
            nodeList = temp;
        }
        int[] resArray = new int[resList.size()];
        for (int i = 0; i < resList.size(); i++) {
            resArray[i] = resList.get(i);
        }
        return resArray;
    }
}
