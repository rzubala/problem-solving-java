package com.zubala.rafal.problems.utils;

import com.zubala.rafal.problems.model.ListNode;

public class ListNodeUtils {
    public static ListNode buildList(int[] nums) {
        ListNode head = null;
        ListNode tmp = null;
        for (int num : nums) {
            ListNode current = new ListNode(num);
            if (head == null) {
                head = current;
            } else {
                tmp.next = current;
            }
            tmp = current;
        };
        return head;
    }
}
