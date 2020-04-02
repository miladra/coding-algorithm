package Leetcode;

public class _001_ReverseLinkedNode {

    public LinkedNode reverseLinkedList(LinkedNode head){

        LinkedNode prev = null;

        while (head != null){
            LinkedNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

}

class LinkedNode{

    int val;
    LinkedNode next;
    LinkedNode(int x){
        val = x;
    }

}
