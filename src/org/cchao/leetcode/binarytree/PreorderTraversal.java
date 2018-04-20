package org.cchao.leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shucc on 18/4/20.
 * cc@cchao.org
 * 前序遍历
 */
public class PreorderTraversal {

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (null != root) {
            result.add(root.val);
            result.addAll(preorderTraversal(root.left));
            result.addAll(preorderTraversal(root.right));
        }
        return result;
    }
}
