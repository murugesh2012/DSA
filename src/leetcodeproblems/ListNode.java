package leetcodeproblems;


import javaconcepts.LinkedListModel;

// Definition for singly-linked list.
public class ListNode {
    int val;
    private ListNode head;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    public void printAll()
    {
        ListNode temp =this;
        while (temp !=null)
        {
            System.out.print(temp.val+ "->");
            temp=temp.next;
        }
        System.out.print("END");
    }
    public String printList() {
        StringBuilder sb = new StringBuilder();
        ListNode current = this;
        while (current != null) {
            sb.append(current.val);
            if (current.next != null) sb.append(" -> ");
            current = current.next;
        }
        return sb.toString();
    }
}
