package Leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class _001_ReverseLinkedNodeTest {

    @Test
    public void reverseLinkedList() {
        LinkedNode node1 = new LinkedNode(1);
        LinkedNode node2 = new LinkedNode(2);
        LinkedNode node3 = new LinkedNode(3);
        LinkedNode node4 = new LinkedNode(4);
        LinkedNode node5 = new LinkedNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        _001_ReverseLinkedNode rll = new _001_ReverseLinkedNode();
        node1 = rll.reverseLinkedList(node1);
        assertEquals(node1.val , 5);
    }
}