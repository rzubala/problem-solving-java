package com.zubala.rafal.problems;

import com.zubala.rafal.problems.model.ListNode;

/**
 * @see <a href="https://leetcode.com/problems/delete-node-in-a-linked-list/description/">Problem description</a>
 */
public class DeleteNode {
    public void deleteNode(ListNode node) {
        ListNode nextNode = node.next;
        ListNode prevNode = null;
        while(node != null) {
            if (prevNode != null && nextNode == null) {
                prevNode.next = null;
                break;
            } else {
                prevNode = node;
                node.val = nextNode.val;
                nextNode = nextNode.next;
            }
            node = node.next;
        }
    }
}
