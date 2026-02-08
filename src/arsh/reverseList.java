package arsh;

import java.util.List;

public class reverseList {

    public static void main(String[] args) {
        // Create nodes
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

// Link them together
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

// node1 is now the head of the list: 1 -> 2 -> 3 -> 4 -> 5 -> 6
        ListNode head = node1;

        reverse(head);

    }

   static void reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode current=head;

        while(current!=null)
        {
            ListNode node =new ListNode();
            node=current.next;
            current.next=prev;
            prev=current;
            current=node;


        }

while (prev!=null)
{
    System.out.println("Reverse a linked list"+prev.val);
    prev=prev.next;
}
    }
}

