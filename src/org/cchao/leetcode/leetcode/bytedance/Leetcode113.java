package org.cchao.leetcode.leetcode.bytedance;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cchen6
 * @Date on 2021/05/11
 * @Description 路径总和
 */
public class Leetcode113 {

    private List<List<Integer>> res = new ArrayList<>();
    private List<Integer> list = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        dfs(root, 0, sum);
        return res;
    }

    public void dfs(TreeNode root, int num, int sum) {
        if (root == null) return;
        num += root.val;
        list.add(root.val);
        if (num == sum && root.left == null && root.right == null) res.add(new ArrayList(list));
        dfs(root.left, num, sum);
        dfs(root.right, num, sum);
        list.remove(list.size() - 1);
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
