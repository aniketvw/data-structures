package org.example;

public class Traversal {

    public static void main(String[] args) {

        Node head=new Node(10);
//        head.next=new Node(20);
//        head.next.next=new Node(30);
//        head.next.next.next=new Node(40);
        printList(head);

    }

    public static void printList(Node head) {
        Node current=head;
        while (current!=null){
            System.out.println(current.data);
            current=current.next;//head.next has reference to next node so head will now be referring to new node
        }

    }

}
