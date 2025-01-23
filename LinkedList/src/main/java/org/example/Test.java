package org.example;

public class Test {

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        Traversal.printList(head);

        System.out.println("-------------------");

//        Node newHead=InsertAtBeginning().insertFirst(head,5);
//        Traversal.printList(newHead);

//        Node newHead=InsertAtEnd.insertLast(head,5);
//        Traversal.printList(newHead);

//        Node newHead=DeleteFirstNode.deleteFirst(head);
//        Traversal.printList(newHead);
//        Node newHead=DeleteLastNode.deleteLast(head);
//        Traversal.printList(newHead);
        Node newHead=InsertAtGivenPos.insertAnywhere(head,2,60);
        Traversal.printList(newHead);

    }

}
