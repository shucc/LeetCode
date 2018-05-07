package org.cchao.leetcode.binarytree;

/**
 * Created by shucc on 18/5/7.
 * cc@cchao.org
 */
public class BuildTree {

    /**
     * 根据中序和后序遍历构建树
     * @param inorder
     *      中序遍历
     * @param postorder
     *      后序遍历
     * @return
     */
    public TreeNode buildTreeFromIP(int[] inorder, int[] postorder) {
        return buildTreeFromIP(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1);
    }

    private TreeNode buildTreeFromIP(int[] inorder, int[] postorder, int inStart, int inEnd, int posStart, int posEnd) {
        if (inStart > inEnd || posStart > posEnd) {
            return null;
        }
        TreeNode treeNode = new TreeNode(postorder[posEnd]);
        int flag = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (postorder[posEnd] == inorder[i]) {
                flag = i;
                break;
            }
        }
        treeNode.left = buildTreeFromIP(inorder, postorder, inStart, flag - 1, posStart, posStart + (flag - 1 - inStart));
        treeNode.right = buildTreeFromIP(inorder, postorder, flag + 1, inEnd, posEnd - inEnd + flag, posEnd - 1);
        return treeNode;
    }

    /**
     * 根据前序和中序遍历构建树
     * @param preorder
     *      前序遍历
     * @param inorder
     *      中序遍历
     * @return
     */
    public TreeNode buildTreeFromPI(int[] preorder, int[] inorder) {
        return buildTreeFromPI(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    private TreeNode buildTreeFromPI(int[] preorder, int[] inorder, int preStart, int preEnd, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        TreeNode treeNode = new TreeNode(preorder[preStart]);
        int flag = 0;
        for (int i = inStart; i<= inEnd; i++) {
            if (preorder[preStart] == inorder[i]) {
                flag = i;
                break;
            }
        }
        treeNode.left = buildTreeFromPI(preorder, inorder, preStart + 1, preStart + flag - inStart, inStart, inEnd - 1);
        treeNode.right = buildTreeFromPI(preorder, inorder, preStart + flag - inStart + 1, preEnd, flag + 1, inEnd);
        return treeNode;
    }
}
