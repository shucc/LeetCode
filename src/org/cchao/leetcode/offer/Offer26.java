package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/4/24
 * @Description 树的子结构
 */
public class Offer26 {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        node2.left = node4;
        node1.left = node2;
        node1.right = node3;
        System.out.println("结果：" + isSubStructure(node1, new TreeNode(3)));
    }

    public static boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) return false;
        return dfs(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    public static boolean dfs(TreeNode A, TreeNode B) {
        if (B == null) return true;
        if (A == null) return false;
        return A.val == B.val && dfs(A.left, B.left) && dfs(A.right, B.right);
    }
}
