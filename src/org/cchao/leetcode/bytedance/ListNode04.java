package org.cchao.leetcode.bytedance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author cchen6
 * @Date on 2020/7/16
 * @Description 排序列表
 */
public class ListNode04 {

    public ListNode sortList(ListNode head) {
        List<Integer> nodeNumList = new ArrayList<>();
        while (null != head) {
            nodeNumList.add(head.val);
            head = head.next;
        }
        Collections.sort(nodeNumList);
        ListNode node = new ListNode(0);
        ListNode tempNode = node;
        for (int i = 0; i < nodeNumList.size(); i++) {
            tempNode.next = new ListNode(nodeNumList.get(i));
            tempNode = tempNode.next;
        }
        return node.next;
    }
}
