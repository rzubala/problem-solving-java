package com.zubala.rafal.problems;

import com.zubala.rafal.problems.model.ListNode;
import com.zubala.rafal.problems.utils.ListNodeUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteNodeTest {

    private final DeleteNode deleteNode = new DeleteNode();

    @Test
    void deleteNode() {
        ListNode head1 = ListNodeUtils.buildList(new int[]{4,5,1,9});
        ListNodeUtils.print(head1);
        deleteNode.deleteNode(head1.next);
        assertTrue(ListNodeUtils.compare(head1, ListNodeUtils.buildList(new int[]{4,1,9})));

        ListNode head2 = ListNodeUtils.buildList(new int[]{4,5,1,9});
        deleteNode.deleteNode(head2.next.next);
        assertTrue(ListNodeUtils.compare(head2, ListNodeUtils.buildList(new int[]{4,5,9})));
    }
}