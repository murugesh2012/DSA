package leetcodeproblems;

import org.w3c.dom.Node;

public class MergeTwoSortedLists_21 {


    public static void main(String[] args)
    {
        ListNode list1=new ListNode(1,new ListNode(2,new ListNode(4)));
        ListNode list2=new ListNode(1,new ListNode(3,new ListNode(4)));
        ListNode list3=new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        ListNode result=mergeTwoLists(list1,list2);
        System.out.println(result.printList());
        System.out.println(reverseList(list3).printList());
        }

    private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Append remaining nodes
        if (list1 != null) {
            current.next = list1;
        } else if (list2 != null) {
            current.next = list2;
        }

        return dummy.next;
    }
    public static ListNode reverseList(ListNode head) {
        ListNode curr = head, prev = null, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;

    }
}
