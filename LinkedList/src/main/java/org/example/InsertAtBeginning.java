package org.example;

public class InsertAtBeginning {


    public static Node insertFirst(Node head, int x) {

        if (head != null) {
            Node temp = head;

            head = new Node(5);//will not change the real one in calling method
            head.next = temp;

        } else {
            head = new Node(x);
        }

        return head;
    }
}
