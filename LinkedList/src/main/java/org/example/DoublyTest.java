package org.example;

public class DoublyTest {

    public static void main(String[] args) {
        DoubleNode head=new DoubleNode(10);
        DoubleNode temp1=new DoubleNode(20);
        DoubleNode temp2=new DoubleNode(30);

        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;
    }

}
