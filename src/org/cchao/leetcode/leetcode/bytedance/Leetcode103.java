package org.cchao.leetcode.leetcode.bytedance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author cchen6
 * @Date on 2021/05/06
 * @Description 二叉树的锯齿形层序遍历
 */
public class Leetcode103 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (null == root) {
            return new ArrayList<>();
        }
        List<TreeNode> nowNodeList = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        nowNodeList.add(root);
        boolean isRightToLeft = true;
        while (!nowNodeList.isEmpty()) {
            List<TreeNode> tempNodeList = new ArrayList<>(nowNodeList);
            List<Integer> tempList = new ArrayList<>();
            nowNodeList.clear();
            for (int i = 0; i < tempNodeList.size(); i++) {
                tempList.add(tempNodeList.get(i).val);
                if (null != tempNodeList.get(i).left) {
                    nowNodeList.add(tempNodeList.get(i).left);
                }
                if (null != tempNodeList.get(i).right) {
                    nowNodeList.add(tempNodeList.get(i).right);
                }
            }
            if (!isRightToLeft) {
                Collections.reverse(tempList);
            }
            isRightToLeft = !isRightToLeft;
            res.add(tempList);
        }
        return res;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
