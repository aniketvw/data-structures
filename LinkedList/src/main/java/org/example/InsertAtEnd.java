package org.example;

public class InsertAtEnd {

    public static Node insertLast(Node head,int x){

        Node temp= new Node(x);
        if(head==null)
            return temp;
        Node current=head;
        while (current.next!=null){
            current=current.next;
        }
        current.next=temp;
        return head;
    }

}
