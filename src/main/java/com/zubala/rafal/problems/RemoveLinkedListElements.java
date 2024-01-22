package com.zubala.rafal.problems;

import com.zubala.rafal.problems.model.ListNode;

/**
 * @see <a href="https://leetcode.com/problems/remove-linked-list-elements/">Problem description</a>
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode it = head;
        ListNode newHead = null;
        ListNode previous = null;
        while (it != null) {
            if (it.val != val) {
                if (newHead == null) {
                    newHead = it;
                } else {
                    previous.next = it;
                }
                previous = it;
            }
            it = it.next;
        }
        if (previous != null) {
            previous.next = null;
        }
        return newHead;
    }
}
