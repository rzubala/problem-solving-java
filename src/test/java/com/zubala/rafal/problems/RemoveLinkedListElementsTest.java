package com.zubala.rafal.problems;

import com.zubala.rafal.problems.model.ListNode;
import com.zubala.rafal.problems.utils.ListNodeUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveLinkedListElementsTest {

    private final RemoveLinkedListElements removeLinkedListElements = new RemoveLinkedListElements();

    @Test
    void removeElements() {
        assertTrue(ListNodeUtils.compare(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4}));
        assertFalse(ListNodeUtils.compare(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3}));
        assertFalse(ListNodeUtils.compare(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 5}));

        ListNode head1 = ListNodeUtils.buildList(new int[]{1, 2, 6, 3, 4, 5, 6});
        ListNode res1 = removeLinkedListElements.removeElements(head1, 6);
        assertTrue(ListNodeUtils.compare(ListNodeUtils.buildList(new int[]{1, 2, 3, 4, 5}), res1));

        ListNode head2 = ListNodeUtils.buildList(new int[]{});
        ListNode res2 = removeLinkedListElements.removeElements(head2, 1);
        assertTrue(ListNodeUtils.compare(ListNodeUtils.buildList(new int[]{}), res2));

        ListNode head3 = ListNodeUtils.buildList(new int[]{7,7,7,7});
        ListNode res3 = removeLinkedListElements.removeElements(head3, 7);
        assertTrue(ListNodeUtils.compare(ListNodeUtils.buildList(new int[]{}), res3));
    }
}