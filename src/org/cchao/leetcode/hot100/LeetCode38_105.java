package org.cchao.leetcode.hot100;

import java.util.Arrays;

/**
 * @author cchen6
 * @Date on 2020/1/17
 * @Description
 */
public class LeetCode38_105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        for (int i = 0; i < preorder.length; i++) {
            if (preorder[0] == inorder[i]) {
                root.left = buildTree(Arrays.copyOfRange(preorder, 1, i + 1), Arrays.copyOfRange(inorder, 0, i));
                root.right = buildTree(Arrays.copyOfRange(preorder, i + 1, preorder.length), Arrays.copyOfRange(inorder, i + 1, inorder.length));
                break;
            }
        }
        return root;
    }


    public static void main(String[] args) {
        int[] temp = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.toString(Arrays.copyOfRange(temp, 0, 3)));
        System.out.println(Arrays.toString(Arrays.copyOfRange(temp, 4, temp.length)));
    }
}
