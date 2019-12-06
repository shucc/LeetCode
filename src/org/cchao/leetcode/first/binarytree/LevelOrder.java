package org.cchao.leetcode.first.binarytree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by shucc on 18/4/24.
 * cc@cchao.org
 */
public class LevelOrder {

    private HashMap<Integer, List<Integer>> result = new HashMap<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (null == root) {
            return new ArrayList<>();
        }
        List<Integer> rootList = new ArrayList<>();
        rootList.add(root.val);
        result.put(0, rootList);
        ergodicTree(root, 0);
        List<List<Integer>> resultList = new ArrayList<>();
        int size = result.size();
        for (int i = 0; i < size; i++) {
            resultList.add(result.get(i));
        }
        return resultList;
    }

    private void ergodicTree(TreeNode root, int level) {
        if (null == root.left && null == root.right) {
            return;
        }
        List<Integer> nowTree = result.get(level + 1);
        if (null == nowTree) {
            nowTree = new ArrayList<>();
        }
        if (null != root.left) {
            nowTree.add(root.left.val);
            ergodicTree(root.left, level + 1);
        }
        if (null != root.right) {
            nowTree.add(root.right.val);
            ergodicTree(root.right, level + 1);
        }
        result.put(level + 1, nowTree);
    }
}
