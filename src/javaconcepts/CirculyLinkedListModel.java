package javaconcepts;

public class CirculyLinkedListModel {
    private Node head;
    private Node tail;
    private int size;
    CirculyLinkedListModel()
    {
        this.size=0;
        this.head=null;
        this.tail=null;
    }

    public void insertElement(int val)
    {
        Node node=new Node(val);
        if(head==null)
        {
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        head=node;
        size+=1;
    }
//
//    public void insertLast(int val)
//    {
//
//        Node node=new Node(val);
////        tail.next=node;
////        tail=node;
//        size++;
//    }
//
//    public void insertMiddle(int val,int index)
//    {
//        if(index==0)
//        {
//            insertElement(val);
//            return;
//        }
//        if(index==size)
//        {
//            insertLast(val);
//            return;
//        }
//        Node temp=head;
//        for(int i=1;i<index;i++)
//        {
//            temp=temp.next;
//        }
//        Node node=new Node(val,temp.next,temp);
//        temp.next=node;
//        node.next.prev=node;
//        size++;
//    }
//    public void deleteFirst()
//    {
//        head=head.next;
//        if(head==null)
//        {
//
//        }
//size--;
//    }
//    public void deleteLast()
//    {
//        Node temp=head;
//        for(int i=1;i<getSize()-1;i++)
//        {
//            temp=temp.next;
//        }
//
//        temp.next=null;
//        size--;
//    }
//    public void deleteMiddle(int index)
//    {
//        if (index < 0 || index >= size) {
//            System.out.println("Invalid index.");
//            return;
//        }
//        if (index == 0) {
//            head = head.next;
//
//            size--;
//            return;
//        }
//        Node temp=head;
//        for(int i=0;i<index-1;i++)
//        {
//            temp=temp.next;
//        }
//        Node prev=temp;
//        prev.next=temp.next.next;
//        size--;
//    }
//
//    public Node findElement(int val)
//    {
//
//        Node temp=head;
//        int index=0;
//        while(temp!=null)
//        {
//            if(temp.val==val)
//            {
//                return temp;
//            }
//            temp=temp.next;
//        }
//        return null;
//    }

    public int getSize() {
        return size;
    }
    public void printAll()
    {
      Node node=head;
      if(head!=null)
      {
          do{
             System.out.print(node.val+"->");
             node=node.next;
          }while(node!=head);
      }

    }

    private class Node {
        int val;
        Node next;
        Node prev;
        Node(int val )
        {
            this.val=val;
        }
        Node(int val,Node next,Node prev)
        {
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }
}
