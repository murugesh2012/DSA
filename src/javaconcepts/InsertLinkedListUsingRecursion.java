package javaconcepts;

public class InsertLinkedListUsingRecursion {
    private static class Node {
        int val;
        Node next;
        Node(int val )
        {
            this.val=val;
        }
        Node(int val,Node next)
        {
            this.val=val;
            this.next=next;

        }
        public static void main(String[] args)
        {
            LinkedListModel list=new LinkedListModel();
            list.insertElement(23);
            list.insertElement(12);
            list.insertElement(67);
            list.insertElement(78);
            list.insertRec(299,2);
            list.printAll();
        }

    }
}
