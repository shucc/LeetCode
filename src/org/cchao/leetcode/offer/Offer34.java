package org.cchao.leetcode.offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author cchen6
 * @Date on 2020/4/24
 * @Description 二叉树中和为某一值的路径
 */
public class Offer34 {

    public static void main(String[] args) {
        TreeNode node7 = new TreeNode(7);
        TreeNode node2 = new TreeNode(2);
        TreeNode node11 = new TreeNode(11);
        node11.left = node7;
        node11.right = node2;
        TreeNode node4 = new TreeNode(4);
        node4.left = node11;
        TreeNode node5 = new TreeNode(5);
        TreeNode node1 = new TreeNode(1);
        TreeNode node4_2 = new TreeNode(4);
        node4_2.left = node5;
        node4_2.right = node1;
        TreeNode node13 = new TreeNode(13);
        TreeNode node8 = new TreeNode(8);
        node8.left = node13;
        node8.right = node4_2;
        TreeNode root = new TreeNode(5);
        root.left = node4;
        root.right = node8;
        Offer34 offer34 = new Offer34();
        System.out.println(offer34.pathSum(root, 22).toString());
    }

    private List<List<Integer>> resList = new ArrayList<>();
    private LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        process(root,  sum);
        return resList;
    }

    private void process(TreeNode root, int sum) {
        if (null == root) {
            return;
        }
        path.add(root.val);
        sum -= root.val;
        if (sum == 0&& root.left == null && root.right == null) {
            resList.add(new LinkedList<>(path));
        }
        process(root.left, sum);
        process(root.right, sum);
        path.removeLast();
    }
}
