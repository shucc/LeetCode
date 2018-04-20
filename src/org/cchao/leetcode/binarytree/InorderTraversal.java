package org.cchao.leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shucc on 18/4/20.
 * cc@cchao.org
 * 中序遍历
 */
public class InorderTraversal {

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (null != root) {
            result.addAll(inorderTraversal(root.left));
            result.add(root.val);
            result.addAll(inorderTraversal(root.right));
        }
        return result;
    }
}
