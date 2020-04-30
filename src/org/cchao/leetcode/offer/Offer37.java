package org.cchao.leetcode.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cchen6
 * @Date on 2020/4/27
 * @Description 序列化二叉树
 */
public class Offer37 {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        node2.left = node4;
        node1.left = node2;
        node1.right = node3;
        System.out.println(new Offer37().serialize(node1));
        String origin = new Offer37().serialize(node1);
        String[] array = origin.substring(1, origin.length() - 1).split(",");
        for (String temp : array) {
            System.out.print(temp);
        }
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<Integer> resList = new ArrayList<>();
        List<TreeNode> nodeList = new ArrayList<>();
        nodeList.add(root);
        while (!nodeList.isEmpty()) {
            List<TreeNode> tempList = new ArrayList<>();
            for (TreeNode node : nodeList) {
                if (null == node) {
                    continue;
                }
                resList.add(node.val);
                tempList.add(node.left);
                tempList.add(node.right);
            }
            nodeList = tempList;
        }
        return resList.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        return null;
    }
}
