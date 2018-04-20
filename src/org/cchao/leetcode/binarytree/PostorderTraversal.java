package org.cchao.leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shucc on 18/4/20.
 * cc@cchao.org
 * 后序遍历
 */
public class PostorderTraversal {

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (null != root) {
            result.addAll(postorderTraversal(root.left));
            result.addAll(postorderTraversal(root.right));
            result.add(root.val);
        }
        return result;
    }
}
