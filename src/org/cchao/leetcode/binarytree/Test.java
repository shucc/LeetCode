package org.cchao.leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shucc on 18/4/20.
 * cc@cchao.org
 */
public class Test {
    
    public static void main(String args[]) {
        TreeNode rightNode = new TreeNode(2);
        rightNode.left = new TreeNode(3);
        rightNode.right = null;
        TreeNode rootNode = new TreeNode(1);
        rootNode.left = null;
        rootNode.right = rightNode;

        //前序遍历
        printNodeInfo(PreorderTraversal.preorderTraversal(rootNode));
        //中序遍历
        printNodeInfo(InorderTraversal.inorderTraversal(rootNode));
        //后序遍历
        printNodeInfo(PostorderTraversal.postorderTraversal(rootNode));
    }

    private static void printNodeInfo(List<Integer> result) {
        StringBuilder stringBuilder = new StringBuilder("");
        for (int temp : result) {
            stringBuilder.append(temp).append("-->");
        }
        System.out.println(stringBuilder.toString());
    }
}
