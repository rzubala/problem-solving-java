package com.zubala.rafal.problems.utils;

import com.zubala.rafal.problems.model.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public static boolean compare(int[] nums1, int[] nums2) {
        return compare(buildList(nums1), buildList(nums2));
    }

    public static boolean compare(ListNode head1, ListNode head2) {
        ListNode node1 = head1, node2 = head2;
        while (node1 != null || node2 != null) {
            if (node1 == null || node2 == null) {
                return false;
            }
            if (node1.val != node2.val) {
                return false;
            }
            node1 = node1.next;
            node2 = node2.next;
        }
        return true;
    }

    public static void print(ListNode head) {
        if (head == null) {
            return;
        }
        ListNode node = head;
        List<Integer> values = new ArrayList<>();
        while(node != null) {
            values.add(node.val);
            node = node.next;
        }
        System.out.println(values.stream().map(String::valueOf).collect(Collectors.joining("->")));
    }
}
