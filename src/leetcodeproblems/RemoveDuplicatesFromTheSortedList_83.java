package leetcodeproblems;

import org.w3c.dom.Node;

public class RemoveDuplicatesFromTheSortedList_83 {
    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5,new ListNode(6))))));
        ListNode node1 = middleDuplicates(node);
        node1.printAll();
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        if (head == null) {
            return head;
        }
        while (temp.next != null) {
            if ( temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp=temp.next;
            }
        }
        return head;
    }

    public static ListNode middleDuplicates(ListNode head) {
        ListNode fast = head;
        ListNode slow=head;
        while(fast !=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

}
