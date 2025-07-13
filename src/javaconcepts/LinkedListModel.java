package javaconcepts;

public class LinkedListModel {
    private Node head;
    private Node tail;
    private int size;
    LinkedListModel()
    {
        this.size=0;
    }
    public void insertElement(int val)
    {
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null)
        {
            tail=head;
        }
        size+=1;
    }

    public void insertLast(int val)
    {
        if(tail==null)
        {
            insertElement(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insertMiddle(int val,int index)
    {
        if(index==0)
        {
            insertElement(val);
            return;
        }
        if(index==size)
        {
            insertLast(val);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
    }
    public void deleteFirst()
    {
        head=head.next;
        if(head==null)
        {
            tail=null;
        }
size--;
    }
    public void deleteLast()
    {
        Node temp=head;
        for(int i=1;i<getSize()-1;i++)
        {
            temp=temp.next;
        }
        tail=temp.next;
        temp.next=null;
        size--;
    }
    public void deleteMiddle(int index)
    {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index.");
            return;
        }
        if (index == 0) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size--;
            return;
        }
        Node temp=head;
        for(int i=0;i<index-1;i++)
        {
            temp=temp.next;
        }
        Node prev=temp;
        prev.next=temp.next.next;
        size--;
    }

    public int getSize() {
        return size;
    }
    public void printAll()
    {
       Node temp =head;
       while (temp !=null)
       {
           System.out.print(temp.val+ "->");
           temp=temp.next;
       }
       System.out.print("END");
    }

    private class Node {
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
    }
}
