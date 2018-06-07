package org.cchao.leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shucc on 18/6/6.
 * cc@cchao.org
 */
public class LeetCode230 {

    public int kthSmallest(TreeNode root, int k) {
        if (null == root) {
            return 0;
        }
        List<Integer> inorderTraversalList = inorderTraversal(root);
        if (k > inorderTraversalList.size()) {
            return 0;
        }
        return inorderTraversalList.get(k - 1);
    }

    /**
     * 中序遍历出来的二叉搜索树是有序的
     * @param root
     * @return
     */
    private List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (null != root) {
            result.addAll(inorderTraversal(root.left));
            result.add(root.val);
            result.addAll(inorderTraversal(root.right));
        }
        return result;
    }

    public int kthSmallest2(TreeNode root, int k) {
        if (null == root) {
            return 0;
        }
        int leftSize = treeSize(root.left);
        if (leftSize == k - 1) {
            return root.val;
        } else if (leftSize >= k) {
            return kthSmallest2(root.left, k);
        } else {
            return kthSmallest2(root.right, k- leftSize - 1);
        }
    }

    private int treeSize(TreeNode root) {
        if (null == root) {
            return 0;
        }
        return 1 + treeSize(root.left) + treeSize(root.right);
    }
}
