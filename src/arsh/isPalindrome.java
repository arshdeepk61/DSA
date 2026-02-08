package arsh;

public class isPalindrome {

    public static void main(String[] args) {
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

        ListNode node11 = new ListNode(1);
        ListNode node22 = new ListNode(2);
        node11.next = node22;
        node22.next = null;

        ListNode head2 = node11;
//        printList(head);
//        printList(head2);
        checkPalindrome(head,head2);

    }

    static void  printList(ListNode head)
    {
        while (head!=null)
        {
            System.out.println("Printing a linked list"+head.val);
            head=head.next;
        }
    }

    static void checkPalindrome(ListNode head1,ListNode head2)
    {
 while(head1!=null&&head2!=null)
 {
     if(head1.val != head2.val)
     {
         System.out.println("not found");
         break;
     }
     head1=head1.next;
     head2=head2.next;

 }
    }
}
