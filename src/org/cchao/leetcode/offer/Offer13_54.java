package org.cchao.leetcode.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cchen6
 * @Date on 2020/3/4
 * @Description 二叉搜索树的第k大节点
 */
public class Offer13_54 {

    private int result = -1;
    private int count = 0;

    public int kthLargest(TreeNode root, int k) {
      kthLargest2(root, k);
      return result;
    }

    private void kthLargest2(TreeNode root, int k) {
        if (null == root) {
            return;
        }
        kthLargest2(root.right, k);
        count++;
        if (count == k) {
            result = root.val;
        }
        kthLargest2(root.left, k);
    }

    public List<Integer> sort(TreeNode root) {
        if (null == root) {
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>();
        list.addAll(sort(root.right));
        list.add(root.val);
        list.addAll(sort(root.left));
        return list;
    }
}
