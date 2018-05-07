package org.cchao.leetcode.binarytree;

/**
 * Created by shucc on 18/5/7.
 * cc@cchao.org
 * 节点的右向指针
 */
public class NodeRightPointer1 {

    public void connect(TreeLinkNode root) {
        if (null == root) {
            return;
        }
        if (null != root.left && null != root.right) {
            root.left.next = root.right;
        }
        if (null != root.next && null != root.right) {
            root.right.next = root.next.left;
        }
        connect(root.left);
        connect(root.right);
    }
}
