package org.cchao.leetcode.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cchen6
 * @Date on 2020/4/23
 * @Description 请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推
 */
public class Offer32_3 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (null == root) {
            return new ArrayList<>();
        }
        List<List<Integer>> resList = new ArrayList<>();
        List<TreeNode> nodeList = new ArrayList<>();
        nodeList.add(root);
        //是否从左往右
        boolean fromLeft = true;
        while (!nodeList.isEmpty()) {
            List<TreeNode> temp = new ArrayList<>();
            List<Integer> tempList = new ArrayList<>();
            for (TreeNode node : nodeList) {
                if (null == node) {
                    continue;
                }
                temp.add(node.left);
                temp.add(node.right);
                if (fromLeft) {
                    tempList.add(node.val);
                } else {
                    tempList.add(0, node.val);
                }
            }
            fromLeft = !fromLeft;
            nodeList = temp;
            if (!tempList.isEmpty()) {
                resList.add(tempList);
            }
        }
        return resList;
    }
}
