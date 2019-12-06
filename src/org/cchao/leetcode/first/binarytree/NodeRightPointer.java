package org.cchao.leetcode.first.binarytree;

/**
 * Created by shucc on 18/5/7.
 * cc@cchao.org
 * 节点的右向指针
 */
public class NodeRightPointer {

    /**
     * 完全二叉树
     * @param root
     */
    public void connect1(TreeLinkNode root) {
        if (null == root) {
            return;
        }
        if (null != root.left && null != root.right) {
            root.left.next = root.right;
        }
        if (null != root.next && null != root.right) {
            root.right.next = root.next.left;
        }
        connect1(root.left);
        connect1(root.right);
    }

    /**
     * 非完全二叉树
     * @param root
     */
    public void connect2(TreeLinkNode root) {
        if (null == root) {
            return;
        }
        TreeLinkNode next = root.next;
        while (null != next) {
            if (null != next.left) {
                next = next.left;
                break;
            }
            if (null != next.right) {
                next = next.right;
                break;
            }
            next = next.next;
        }
        if (null != root.right) {
            root.right.next = next;
        }
        if (null != root.left) {
            root.left.next = (null != root.right ? root.right : next);
        }
        connect2(root.right);
        connect2(root.left);
    }
}
