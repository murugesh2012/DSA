package javaconcepts;

import java.util.LinkedList;

public class LinkedListLearning {


    public static void main(String[] args)
    {
        LinkedList<Integer> linkedList=new LinkedList<>();
        LinkedListModel list=new LinkedListModel();
        list.insertElement(34);
        list.insertElement(23);
        list.insertElement(12);
        list.insertElement(67);
        list.insertElement(78);
        list.insertMiddle(299,3);
        list.printAll();
        System.out.println();
        list.deleteFirst();
        list.printAll();
        System.out.println();
        list.deleteLast();
        list.insertElement(45);
        list.printAll();
        System.out.println();
        list.deleteMiddle(2);
        list.printAll();
        System.out.println();

System.out.println(list.getSize());


        linkedList.add(1);
        linkedList.add(127);
        linkedList.add(235);
        System.out.println(linkedList);
    }
}
