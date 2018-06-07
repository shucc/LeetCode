package org.cchao.leetcode.binarytree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by shucc on 18/6/6.
 * cc@cchao.org
 * 锯齿形遍历
 */
public class LeetCode103 {

    private HashMap<Integer, List<Integer>> resultMap = new HashMap<>();

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (null == root) {
            return new ArrayList<>();
        }
        List<Integer> head = new ArrayList<>();
        head.add(root.val);
        resultMap.put(0, head);
        zigzagLevelOrder(root, 1, false);
        return new ArrayList<>(resultMap.values());
    }

    private void zigzagLevelOrder(TreeNode root, int deepPath, boolean isLeftToRight) {
        if (null == root) {
            return;
        }
        List<Integer> temp = new ArrayList<>();
        if (isLeftToRight) {
            if (null != root.left) {
                temp.add(root.left.val);
            }
            if (null != root.right) {
                temp.add(root.right.val);
            }
        } else {
            if (null != root.right) {
                temp.add(root.right.val);
            }
            if (null != root.left) {
                temp.add(root.left.val);
            }
        }
        if (isLeftToRight) {
            if (null != root.right) {
                zigzagLevelOrder(root.right, deepPath + 1, false);
            }
            if (null != root.left) {
                zigzagLevelOrder(root.left, deepPath + 1, false);
            }
        } else {
            if (null != root.left) {
                zigzagLevelOrder(root.left, deepPath + 1, true);
            }
            if (null != root.right) {
                zigzagLevelOrder(root.right, deepPath + 1, true);
            }
        }
        if (!temp.isEmpty()) {
            List<Integer> now = resultMap.get(deepPath);
            if (null == now) {
                resultMap.put(deepPath, temp);
            } else {
                now.addAll(temp);
                resultMap.put(deepPath, now);
            }
        }
    }
}
