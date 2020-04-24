package org.cchao.leetcode.offer;

import java.util.Arrays;

/**
 * @author cchen6
 * @Date on 2020/4/23
 * @Description 重建二叉树
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字
 */
public class Offer07 {

    public static void main(String[] args) {
        int[] preodrer = new int[]{3, 9, 20, 15, 7};
        int[] inorder = new int[]{9, 3, 15, 20, 7};
        TreeNode treeNode = buildTree(preodrer, inorder);
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }
        int rootVal = preorder[0];
        if (preorder.length == 1) {
            return new TreeNode(rootVal);
        }
        //root在中序遍历中的下标，前面的表示是左node的中序遍历，后面表示右node的中序遍历
        int inorderRootIndex = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == rootVal) {
                inorderRootIndex = i;
                break;
            }
        }
        TreeNode rootNode = new TreeNode(rootVal);
        rootNode.left = buildTree(Arrays.copyOfRange(preorder, 1, 1 + inorderRootIndex), Arrays.copyOfRange(inorder, 0, inorderRootIndex));
        rootNode.right = buildTree(Arrays.copyOfRange(preorder, 1 + inorderRootIndex, preorder.length), Arrays.copyOfRange(inorder, inorderRootIndex + 1, inorder.length));
        return rootNode;
    }
}
