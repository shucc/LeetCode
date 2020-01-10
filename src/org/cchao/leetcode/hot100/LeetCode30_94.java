package org.cchao.leetcode.hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cchen6
 * @Date on 2020/1/9
 * @Description
 */
public class LeetCode30_94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> integerList = new ArrayList<>();
        if (root == null) {
            return integerList;
        }
        integerList.addAll(inorderTraversal(root.left));
        integerList.add(root.val);
        integerList.addAll(inorderTraversal(root.right));
        return integerList;
    }

    public static void main(String[] args) {

    }
}
