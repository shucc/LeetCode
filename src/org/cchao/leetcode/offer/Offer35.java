package org.cchao.leetcode.offer;

/**
 * @author cchen6
 * @Date on 2020/4/27
 * @Description 复杂链表的复制
 */
public class Offer35 {

//    public Node copyRandomList(Node head) {
//        if (head == null) {
//            return null;
//        }
//        copy(head);
//        randomDirect(head);
//        return reList(head);
//    }

//    //拷贝链表
//    private void copy(Node head) {
//        while (head != null) {
//            Node newNode = new Node(head.val);
//            newNode.next = head.next;
//            head.next = newNode;
//            head = newNode.next;
//        }
//    }
//
//    //指定随机指针
//    private void randomDirect(Node head) {
//        while (head != null) {
//            Node random = head.random;
//            if (null != random) {
//                head.next.random = random.next;
//            }
//            head = head.next.next;
//        }
//    }
//
//    //重新连接 链表
//    private Node reList(Node head) {
//        Node cloneNode = head.next;
//        Node cloneHead = cloneNode;
//        head.next = cloneNode.next;
//        head = head.next;
//        while (head != null) {
//            cloneNode.next = head.next;
//            head.next = head.next.next;
//            head = head.next;
//            cloneNode = cloneNode.next;
//        }
//        return cloneHead;
//    }
}
